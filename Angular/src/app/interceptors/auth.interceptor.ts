import { Injectable } from '@angular/core';
import {
  HttpRequest,
  HttpHandler,
  HttpEvent,
  HttpInterceptor,
  HttpResponse,
  HttpEventType,
} from '@angular/common/http';
import { Observable, catchError, finalize, tap } from 'rxjs';
import { LoadingService } from '../services/loading.service';

@Injectable()
export class AuthInterceptor implements HttpInterceptor {
  constructor(private loadingService: LoadingService) {}

  intercept(
    request: HttpRequest<unknown>,
    next: HttpHandler
  ): Observable<HttpEvent<unknown>> {
    this.loadingService.startLoading();
    // Header kısmına token eklenmesi
    let newRequest = request.clone({
      setHeaders: {
        Authorization: 'Bearer 123',
      },
      //body: request.body
    });
    return next.handle(newRequest).pipe(
      tap((httpEvent: HttpEvent<any>) => {
        //if (httpEvent.type == HttpEventType.Response) {
        if (httpEvent instanceof HttpResponse) {
          console.log('Cevap alındı:', httpEvent);
        }
      }),
      catchError((err: any) => {
        // işlem..
        console.log('Hatalı cevap alındı:', err);
        throw err;
      }),
      finalize(() => {
        this.loadingService.stopLoading();
      })
    );
  }
}
