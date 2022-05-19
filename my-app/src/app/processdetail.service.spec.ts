import { TestBed } from '@angular/core/testing';

import { ProcessdetailService } from './processdetail.service';

describe('ProcessdetailService', () => {
  let service: ProcessdetailService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ProcessdetailService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
