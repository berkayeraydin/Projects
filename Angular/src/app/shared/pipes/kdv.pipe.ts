import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'kdv',
})
export class KdvPipe implements PipeTransform {
  // gönderilmediğinde 20 olarak kabul et..
  transform(value: number, kdv: number = 20): number {
    let oran = (kdv * value) / 100;
    return value + oran;
  }
}
