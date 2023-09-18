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

  count: number = 0;

  ngOnInit(): void {
    console.log('Merhaba');
    this.name = 'Halit'; // Classin içindeki bir değişkene işaret etmek için `this`
  }
  // Component Life Cycle

  // Two Way Data Binding => Html ve TS tarafındaki
  // verilerin iki tarafta da anlık olarak eşitlenmesini sağlar.

  increase() {
    this.count++;
  }
  decrease() {
    this.count--;
  }
  onNameChange() {
    console.log('İsim değiştirildi, yeni isim:', this.name);
  }
  submit() {
    let request = { name: this.name, age: this.count };
    console.log(request);
  }
}
