import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FindCustComponent } from './find-cust.component';

describe('FindCustComponent', () => {
  let component: FindCustComponent;
  let fixture: ComponentFixture<FindCustComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ FindCustComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(FindCustComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
