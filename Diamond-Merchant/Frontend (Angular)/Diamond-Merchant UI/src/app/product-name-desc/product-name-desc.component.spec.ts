import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ProductNameDescComponent } from './product-name-desc.component';

describe('ProductNameDescComponent', () => {
  let component: ProductNameDescComponent;
  let fixture: ComponentFixture<ProductNameDescComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ProductNameDescComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ProductNameDescComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
