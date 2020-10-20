import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SaveCustComponent } from './save-cust.component';

describe('SaveCustComponent', () => {
  let component: SaveCustComponent;
  let fixture: ComponentFixture<SaveCustComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ SaveCustComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(SaveCustComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
