import { Component, OnInit } from '@angular/core';
import { LoadingService } from 'src/app/shared/services/loading.service';

@Component({
  selector: 'app-loading',
  templateUrl: './loading.component.html',
  styleUrls: ['./loading.component.css'],
})
export class LoadingComponent implements OnInit {
  isLoading: boolean = false;

  constructor(private loadingService: LoadingService) {}
  ngOnInit(): void {
    // BehaviorSubject => Subscribe olunan anda veri akışı sağlar => Başlangıç değeri olduğu için.
    // Subject => Başlangıç değeri yok, veri ilk değiştiği an subscribe metoduna veri akışı sağlar.
    this.loadingService.isLoadingSubject.subscribe((value) => {
      this.isLoading = value;
    });
  }
}
