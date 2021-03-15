import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ManageRetailersComponent } from './manage-retailers.component';

describe('ManageRetailersComponent', () => {
  let component: ManageRetailersComponent;
  let fixture: ComponentFixture<ManageRetailersComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ManageRetailersComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ManageRetailersComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
