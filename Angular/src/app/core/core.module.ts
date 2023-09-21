import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { CoreRoutingModule } from './core-routing.module';
import { CoreLayoutComponent } from './components/core-layout/core-layout.component';

@NgModule({
  declarations: [CoreLayoutComponent],
  imports: [CommonModule, CoreRoutingModule],
  exports: [],
})
export class CoreModule {}
