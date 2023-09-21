import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CoreLayoutComponent } from './core-layout.component';

describe('CoreLayoutComponent', () => {
  let component: CoreLayoutComponent;
  let fixture: ComponentFixture<CoreLayoutComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [CoreLayoutComponent]
    });
    fixture = TestBed.createComponent(CoreLayoutComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
