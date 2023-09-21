import { Injectable } from '@angular/core';
import { BehaviorSubject, Subject } from 'rxjs';

@Injectable({
  providedIn: 'root',
})
export class LoadingService {
  isLoading: boolean = false; // Sıradan bir değişken => Her değişikliğinde uygulamadaki bu değişkeni
  // dinleyen mekanizmalara haber vermesi lazım.

  // Subject,BehaviorSubject

  // Abone olunabilen değişkenler..
  // Değişiklikten anında haberdar edilir..
  isLoadingSubject: BehaviorSubject<boolean> = new BehaviorSubject<boolean>(
    false
  );

  constructor() {}

  startLoading() {
    this.isLoading = true;
    this.isLoadingSubject.next(true);
  }

  stopLoading() {
    this.isLoading = false;
    this.isLoadingSubject.next(false);
  }
}
// değişken Subject<degiskenTuru> şeklinde tanımlanmalı
// değer atamaları .next() fonksiyonu kullanılarak yapılmalı
// değişkenin değerinin dinleneceği noktalarda subscribe() olunmalı
