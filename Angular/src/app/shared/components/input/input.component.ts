import { Component, EventEmitter, Input, Output } from '@angular/core';

@Component({
  selector: 'app-input',
  templateUrl: './input.component.html',
  styleUrls: ['./input.component.css'],
})
export class InputComponent {
  @Input() label: string = 'Kullanıcı Adı';
  @Output() onValueChange = new EventEmitter();

  valueChange(event: any) {
    let val = event.target.value;
    this.onValueChange.emit(val);
  }
}

// Parent to Child => Input
// Child to Parent => Output
