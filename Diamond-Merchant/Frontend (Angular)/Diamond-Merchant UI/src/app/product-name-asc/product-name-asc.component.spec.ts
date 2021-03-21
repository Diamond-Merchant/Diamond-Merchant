import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ProductNameAscComponent } from './product-name-asc.component';

describe('ProductNameAscComponent', () => {
  let component: ProductNameAscComponent;
  let fixture: ComponentFixture<ProductNameAscComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ProductNameAscComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ProductNameAscComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
