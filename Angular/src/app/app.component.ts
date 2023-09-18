import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  //template: '<p>Merhaba Template</p>',
  styleUrls: ['./app.component.css'],
  //styles: ['p {color:red}'],
})
// export => dış paketler tarafından import edilebilmesi demek..
export class AppComponent {
  title = 'etiya-angular-starter';
}
