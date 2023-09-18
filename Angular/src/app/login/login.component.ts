import { Component, OnInit } from '@angular/core';
import { PostForListingModel } from '../models/postForListingModel';
import { PostService } from '../services/post.service';
import {
  FormGroup,
  FormBuilder,
  FormControl,
  Validators,
} from '@angular/forms';

@Component({
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css'],
})

export class LoginComponent implements OnInit {
  formGroup!: FormGroup;

  constructor(
    private postService: PostService,
    private formBuilder: FormBuilder
  ) {}
  ngOnInit(): void {
    this.createLoginForm();
  }

  createLoginForm() {
    this.formGroup = this.formBuilder.group({
      username: new FormControl('', [
        Validators.required,
        Validators.minLength(3),
      ]), // 1. param => Formdaki bu alanın başlangıç değeri
      // 2. param => validasyonlar
      password: new FormControl('', [
        Validators.required,
        Validators.minLength(3),
      ]),
    });
  }

  submit() {
    if (this.formGroup.invalid) {
      console.log(this.formGroup);
      return;
    }
    console.log(this.formGroup.value);
  }
}