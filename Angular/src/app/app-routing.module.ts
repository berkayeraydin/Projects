import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

// etiya.com/admin/x
// etiya.com/admin/y
const routes: Routes = [
  {
    path: 'posts',
    loadChildren: () =>
      import('./features/post/post.module').then((m) => m.PostModule), // Angular Lazy Load Routing
  },
  {
    path: 'albums',
    loadChildren: () =>
      import('./features/album/album.module').then((m) => m.AlbumModule), // Angular Lazy Load Routing
  },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule {}
