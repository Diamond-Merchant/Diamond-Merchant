import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RetrieveBillComponent } from './retrieve-bill.component';

describe('RetrieveBillComponent', () => {
  let component: RetrieveBillComponent;
  let fixture: ComponentFixture<RetrieveBillComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ RetrieveBillComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(RetrieveBillComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
