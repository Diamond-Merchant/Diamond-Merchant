import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RetrieveProductCategoryBraceletComponent } from './retrieve-product-category-bracelet.component';

describe('RetrieveProductCategoryBraceletComponent', () => {
  let component: RetrieveProductCategoryBraceletComponent;
  let fixture: ComponentFixture<RetrieveProductCategoryBraceletComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ RetrieveProductCategoryBraceletComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(RetrieveProductCategoryBraceletComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
