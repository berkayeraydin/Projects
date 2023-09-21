import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { InputComponent } from './components/input/input.component';
import { HTTP_INTERCEPTORS, HttpClientModule } from '@angular/common/http';
import { AuthInterceptor } from './interceptors/auth.interceptor';
import { JwtModule } from '@auth0/angular-jwt';
import { ToastrModule } from 'ngx-toastr';
import { HighlightDirective } from './directives/highlight.directive';
import { IfNotDirective } from './directives/if-not.directive';
import { PostDetailComponent } from './pages/post-detail/post-detail.component';
import { RegisterComponent } from './pages/register/register.component';
import { LoginComponent } from './pages/login/login.component';
import { PostListComponent } from './pages/post-list/post-list.component';
import { ExampleComponent } from './components/example/example.component';
import { DemoComponent } from './components/demo/demo.component';
import { LoadingComponent } from './components/loading/loading.component';
import { LayoutComponent } from './components/layout/layout.component';
@NgModule({
  declarations: [
    AppComponent,
    ExampleComponent,
    DemoComponent,
    LoginComponent,
    InputComponent,
    RegisterComponent,
    LoadingComponent,
    HighlightDirective,
    IfNotDirective,
    PostListComponent,
    PostDetailComponent,
    LayoutComponent,
  ], // Bu modül hangi tanımlamaları yapıyor?
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
    ReactiveFormsModule,
    JwtModule.forRoot({
      config: {
        tokenGetter: () => {
          return localStorage.getItem('token');
        },
      },
    }),
    ToastrModule.forRoot(),
  ], // Dış modüllerin import edilmesi.
  providers: [
    { provide: HTTP_INTERCEPTORS, useClass: AuthInterceptor, multi: true },
  ], // DI
  bootstrap: [AppComponent],
  exports: [ExampleComponent], // Declarations kısımındakilerden hangileri dışarıya açılacak?
})
export class AppModule {}
