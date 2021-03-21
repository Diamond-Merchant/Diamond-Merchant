import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ProductMfgDescComponent } from './product-mfg-desc.component';

describe('ProductMfgDescComponent', () => {
  let component: ProductMfgDescComponent;
  let fixture: ComponentFixture<ProductMfgDescComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ProductMfgDescComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ProductMfgDescComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
