import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { LoginResponseModel } from '../../shared/models/loginResponseModel';
import { JwtHelperService } from '@auth0/angular-jwt';
import { LoginRequestModel } from 'src/app/shared/models/loginRequestModel';

@Injectable({
  providedIn: 'root',
})
export class AuthService {
  apiUrl: string = 'https://dummyjson.com/';
  constructor(
    private httpClient: HttpClient,
    private jwtService: JwtHelperService
  ) {}

  login(model: LoginRequestModel): Observable<LoginResponseModel> {
    return this.httpClient.post<LoginResponseModel>(
      this.apiUrl + 'auth/login',
      model
    );
  }

  isAuthenticated(): boolean {
    // JWT
    // ??
    let token = localStorage.getItem('token');
    if (!token) return false;
    try {
      let expired = this.jwtService.isTokenExpired(token);
      if (expired) return false;
    } catch {
      return false;
    }
    return true;
  }

  isAuthorized(roles: string[]): boolean {
    let decodedToken = this.jwtService.decodeToken();
    // Rol olmadığı için username kullanıldı.
    let anyMatch = roles.some((e) => e == decodedToken.username);
    return anyMatch;
  }
}

// CTRL + P
