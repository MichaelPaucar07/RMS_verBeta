import { TestBed } from '@angular/core/testing';
import { CanActivateFn } from '@angular/router';

import { clienteGuard } from './cliente.guard';

describe('clienteGuard', () => {
  let guard: clienteGuard;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    guard = TestBed.inject(clienteGuard);
  });

  it('should be created', () => {
    expect(guard).toBeTruthy();
  });
});