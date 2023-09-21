import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { SharedRoutingModule } from './shared-routing.module';
import { HomepageComponent } from './pages/homepage/homepage.component';
import { InputComponent } from './components/input/input.component';
import { LayoutComponent } from './components/layout/layout.component';
import { LoadingComponent } from './components/loading/loading.component';
import { HighlightDirective } from './directives/highlight.directive';
import { IfNotDirective } from './directives/if-not.directive';
import { LoginComponent } from './pages/login/login.component';
import { RegisterComponent } from './pages/register/register.component';
import { ExamplePipe } from './pipes/example.pipe';
import { KdvPipe } from './pipes/kdv.pipe';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';

@NgModule({
  declarations: [
    HomepageComponent,
    InputComponent,
    LayoutComponent,
    LoadingComponent,
    LoginComponent,
    RegisterComponent,
    HighlightDirective,
    IfNotDirective,
    ExamplePipe,
    KdvPipe,
  ],
  imports: [
    CommonModule,
    SharedRoutingModule,
    FormsModule,
    ReactiveFormsModule,
  ],
  exports: [
    InputComponent,
    LayoutComponent,
    LoadingComponent,
    HighlightDirective,
    IfNotDirective,
  ],
})
export class SharedModule {}
