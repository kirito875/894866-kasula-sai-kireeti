import { TestBed } from '@angular/core/testing';

import { HeaderconfigInterceptor } from './headerconfig.interceptor';

describe('HeaderconfigInterceptor', () => {
  beforeEach(() => TestBed.configureTestingModule({
    providers: [
      HeaderconfigInterceptor
      ]
  }));

  it('should be created', () => {
    const interceptor: HeaderconfigInterceptor = TestBed.inject(HeaderconfigInterceptor);
    expect(interceptor).toBeTruthy();
  });
});
