import { ExamplePipe } from '../../../shared/pipes/example.pipe';

describe('ExamplePipe', () => {
  it('create an instance', () => {
    const pipe = new ExamplePipe();
    expect(pipe).toBeTruthy();
  });
});
