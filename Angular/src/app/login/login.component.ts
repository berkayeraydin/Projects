import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { PostForListingModel } from '../models/postForListingModel';

@Component({
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css'],
})

// Angular Attributeları arasında fonks. ve eventler
// ()

// Attribute ve özellikler
// []
export class LoginComponent implements OnInit {
  // constructor (bağımlılık yükleme) => ngOnInit => ngOnChanges => ngOnDestroy
  posts: PostForListingModel[] = [];
  constructor(private httpClient: HttpClient) {}

  // Arrow Function
  // (y) => {}

  // COMMONJS Function
  // function x(y) {}

  // Modelleme => Üzerinde çalıştığımız verilerin prototipini oluşturmak.
  ngOnInit(): void {
    this.httpClient
      .get<PostForListingModel[]>('https://jsonplaceholder.typicode.com/posts')
      .subscribe((response: PostForListingModel[]) => {
        this.posts = response;
      });

    // Söz => Async bir işlem yaptığında sana olumlu-olumsuz bir cevap kesin dönecek.
    // Abone => bir cevap döndüğünde beni bu fonksiyon aracılığı ile haberdar et.

    // subscribe => (response,error)
  }

  passwordChange(password: string) {
    console.log('password change', password);
  }
}
