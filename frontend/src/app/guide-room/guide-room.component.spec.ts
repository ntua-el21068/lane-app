import { TestBed } from '@angular/core/testing';
import { HttpClientTestingModule } from '@angular/common/http/testing';
import { GuideRoomComponent } from './guide-room.component';

describe('GuideRoomComponent', () => {
  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [GuideRoomComponent, HttpClientTestingModule],
    }).compileComponents();
  });

  it('should create', () => {
    const fixture = TestBed.createComponent(GuideRoomComponent);
    const component = fixture.componentInstance;
    expect(component).toBeTruthy();
  });
});
