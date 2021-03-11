import { ComponentFixture, TestBed } from '@angular/core/testing';

import { StoreRetailerComponent } from './store-retailer.component';

describe('StoreRetailerComponent', () => {
  let component: StoreRetailerComponent;
  let fixture: ComponentFixture<StoreRetailerComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ StoreRetailerComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(StoreRetailerComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
