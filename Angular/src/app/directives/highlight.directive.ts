import { Directive, ElementRef, HostListener, Input } from '@angular/core';

@Directive({
  selector: '[appHighlight]',
})
// Behavorial Directive
// Structural Directive
export class HighlightDirective {
  @Input() appHighlight: string = 'red';

  // Attribute'ın eklendiği elementin kendisini ifade eder
  constructor(private el: ElementRef) {}

  @HostListener('mouseenter')
  highlight() {
    this.el.nativeElement.style.backgroundColor = this.appHighlight;
  }

  @HostListener('mouseleave')
  unHighlight() {
    this.el.nativeElement.style.backgroundColor = 'transparent';
  }
}

// Elementlerimize verdiğimiz attributelar ile bu element referansları üzerinde işlemler uygulamak..
