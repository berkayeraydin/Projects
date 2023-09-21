import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { authGuard } from './guards/auth.guard';
import { roleGuard } from './guards/role.guard';
import { PostDetailComponent } from './pages/post-detail/post-detail.component';
import { LoginComponent } from './pages/login/login.component';
import { RegisterComponent } from './pages/register/register.component';
import { PostListComponent } from './pages/post-list/post-list.component';
import { ExampleComponent } from './components/example/example.component';
import { DemoComponent } from './components/demo/demo.component';

// etiya.com/admin/x
// etiya.com/admin/y
const routes: Routes = [
  {
    path: 'admin',
    component: DemoComponent,
    canActivate: [authGuard],
  }, // Sadece giriş yapmış olma koruması
  {
    path: 'dashboard',
    //component: ExampleComponent,
    canActivate: [authGuard],
    children: [
      { path: '', component: ExampleComponent },
      { path: 'products', component: DemoComponent, pathMatch: 'full' },
    ],
  }, // Giriş yapmış olma ve istediğim rollere sahip olma koruması
  { path: 'login', component: LoginComponent }, // korumasız route
  { path: 'register', component: RegisterComponent },
  { path: '', component: DemoComponent },
  {
    path: 'posts',
    children: [
      { path: 'list', component: PostListComponent },
      { path: 'detail', component: PostDetailComponent },
    ],
  },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule {}
