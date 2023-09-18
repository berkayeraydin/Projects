import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ExampleComponent } from './example/example.component';
import { DemoComponent } from './demo/demo.component';
import { FormsModule } from '@angular/forms';

@NgModule({
  declarations: [AppComponent, ExampleComponent, DemoComponent], // Bu modül hangi tanımlamaları yapıyor?
  imports: [BrowserModule, AppRoutingModule, FormsModule], // Dış modüllerin import edilmesi.
  providers: [], // DI
  bootstrap: [AppComponent],
  exports: [ExampleComponent], // Declarations kısımındakilerden hangileri dışarıya açılacak?
})
export class AppModule {}
