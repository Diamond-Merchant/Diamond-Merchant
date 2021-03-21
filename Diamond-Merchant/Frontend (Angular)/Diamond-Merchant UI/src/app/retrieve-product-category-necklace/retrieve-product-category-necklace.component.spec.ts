import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RetrieveProductCategoryNecklaceComponent } from './retrieve-product-category-necklace.component';

describe('RetrieveProductCategoryNecklaceComponent', () => {
  let component: RetrieveProductCategoryNecklaceComponent;
  let fixture: ComponentFixture<RetrieveProductCategoryNecklaceComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ RetrieveProductCategoryNecklaceComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(RetrieveProductCategoryNecklaceComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
