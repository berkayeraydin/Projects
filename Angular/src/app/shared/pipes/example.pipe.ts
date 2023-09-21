import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'example',
})
export class ExamplePipe implements PipeTransform {
  // value => pipe'ın uygulandığı verinin kendisi
  // args => pipe'ın alacağı argümanlar
  transform(value: any, param1?: string): string {
    return value + param1;
  }
}
