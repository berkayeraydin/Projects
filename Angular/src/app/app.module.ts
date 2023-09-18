import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ExampleComponent } from './example/example.component';
import { DemoComponent } from './demo/demo.component';
import { FormsModule } from '@angular/forms';
import { LoginComponent } from './login/login.component';
import { InputComponent } from './input/input.component';
import { HttpClientModule } from '@angular/common/http';

@NgModule({
  declarations: [
    AppComponent,
    ExampleComponent,
    DemoComponent,
    LoginComponent,
    InputComponent,
  ], // Bu modül hangi tanımlamaları yapıyor?
  imports: [BrowserModule, AppRoutingModule, FormsModule, HttpClientModule], // Dış modüllerin import edilmesi.
  providers: [], // DI
  bootstrap: [AppComponent],
  exports: [ExampleComponent], // Declarations kısımındakilerden hangileri dışarıya açılacak?
})
export class AppModule {}
