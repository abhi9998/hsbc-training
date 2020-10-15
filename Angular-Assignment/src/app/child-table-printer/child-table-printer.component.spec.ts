import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ChildTablePrinterComponent } from './child-table-printer.component';

describe('ChildTablePrinterComponent', () => {
  let component: ChildTablePrinterComponent;
  let fixture: ComponentFixture<ChildTablePrinterComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ChildTablePrinterComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ChildTablePrinterComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
