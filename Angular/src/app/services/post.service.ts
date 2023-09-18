import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { PostForListingModel } from '../models/postForListingModel';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root',
})
export class PostService {
  controllerUrl: string = environment.API_URL + 'posts/';

  constructor(private httpClient: HttpClient) {}

  getAll(): Observable<PostForListingModel[]> {
    return this.httpClient.get<PostForListingModel[]>(this.controllerUrl);
  }

  getById(id: number): Observable<PostForListingModel> {
    return this.httpClient.get<PostForListingModel>(this.controllerUrl + id);
  }
}
