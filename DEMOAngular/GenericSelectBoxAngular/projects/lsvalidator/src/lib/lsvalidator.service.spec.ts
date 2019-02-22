import { TestBed } from '@angular/core/testing';

import { LSValidatorService } from './lsvalidator.service';

describe('LSValidatorService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: LSValidatorService = TestBed.get(LSValidatorService);
    expect(service).toBeTruthy();
  });
});
