import { TestBed } from '@angular/core/testing';

import { CustjsonService } from './custjson.service';

describe('CustjsonService', () => {
  let service: CustjsonService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(CustjsonService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
