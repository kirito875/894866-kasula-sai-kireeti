import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ReturnorderportalComponent } from './returnorderportal.component';

describe('ReturnorderportalComponent', () => {
  let component: ReturnorderportalComponent;
  let fixture: ComponentFixture<ReturnorderportalComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ReturnorderportalComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ReturnorderportalComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
