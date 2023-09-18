import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-demo',
  templateUrl: './demo.component.html',
  styleUrls: ['./demo.component.css'],
})
export class DemoComponent implements OnInit {
  // degisken_adi:degisken_turu=degisken_degeri
  name: string = 'enes';
  age: number = 21;

  ngOnInit(): void {
    console.log('Merhaba');
    this.name = 'Halit'; // Classin içindeki bir değişkene işaret etmek için `this`
  }

  // Component Life Cycle
}
