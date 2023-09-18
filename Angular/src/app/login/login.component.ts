import { Component, OnInit } from '@angular/core';
import { PostForListingModel } from '../models/postForListingModel';
import { PostService } from '../services/post.service';

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
  isLoading: boolean = true;
  constructor(private postService: PostService) {}

  // Arrow Function
  // (y) => {}

  // COMMONJS Function
  // function x(y) {}

  // Modelleme => Üzerinde çalıştığımız verilerin prototipini oluşturmak.
  ngOnInit(): void {
    // Söz => Async bir işlem yaptığında sana olumlu-olumsuz bir cevap kesin dönecek.
    // Abone => bir cevap döndüğünde beni bu fonksiyon aracılığı ile haberdar et.
    // subscribe => (response,error)

    this.postService.getAll().subscribe((response) => {
      this.posts = response;
      this.isLoading = false;
    });
  }

  passwordChange(password: string) {
    console.log('password change', password);
  }
}
