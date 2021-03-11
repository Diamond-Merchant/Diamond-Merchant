import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RetrieveRetailerComponent } from './retrieve-retailer.component';

describe('RetrieveRetailerComponent', () => {
  let component: RetrieveRetailerComponent;
  let fixture: ComponentFixture<RetrieveRetailerComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ RetrieveRetailerComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(RetrieveRetailerComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
