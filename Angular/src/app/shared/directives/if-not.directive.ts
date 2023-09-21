import { Directive, Input, TemplateRef, ViewContainerRef } from '@angular/core';

@Directive({
  selector: '[ngIfNot]',
})
export class IfNotDirective {
  constructor(
    private viewContainer: ViewContainerRef, // direktifin uygulandığı elementin ta kendisi (parent)
    private templateRef: TemplateRef<any> // direktifin uygulandığı elementin alt elementleri (childlar)
  ) {}

  @Input()
  set ngIfNot(condition: boolean) {
    if (condition == false) {
      this.viewContainer.clear();
      this.viewContainer.createEmbeddedView(this.templateRef);
      //this.viewContainer.createComponent(RegisterComponent);
    }
  }
}
