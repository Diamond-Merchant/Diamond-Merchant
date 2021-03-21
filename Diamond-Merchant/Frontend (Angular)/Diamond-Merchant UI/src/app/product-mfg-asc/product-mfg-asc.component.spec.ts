import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ProductMfgAscComponent } from './product-mfg-asc.component';

describe('ProductMfgAscComponent', () => {
  let component: ProductMfgAscComponent;
  let fixture: ComponentFixture<ProductMfgAscComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ProductMfgAscComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ProductMfgAscComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
