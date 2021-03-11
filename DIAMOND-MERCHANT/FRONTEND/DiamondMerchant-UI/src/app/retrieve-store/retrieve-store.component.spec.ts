import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RetrieveStoreComponent } from './retrieve-store.component';

describe('RetrieveStoreComponent', () => {
  let component: RetrieveStoreComponent;
  let fixture: ComponentFixture<RetrieveStoreComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ RetrieveStoreComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(RetrieveStoreComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
