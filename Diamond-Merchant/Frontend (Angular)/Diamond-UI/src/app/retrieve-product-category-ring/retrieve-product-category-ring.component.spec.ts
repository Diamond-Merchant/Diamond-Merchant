import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RetrieveProductCategoryRingComponent } from './retrieve-product-category-ring.component';

describe('RetrieveProductCategoryRingComponent', () => {
  let component: RetrieveProductCategoryRingComponent;
  let fixture: ComponentFixture<RetrieveProductCategoryRingComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ RetrieveProductCategoryRingComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(RetrieveProductCategoryRingComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
