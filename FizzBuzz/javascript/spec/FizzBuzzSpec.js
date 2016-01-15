describe("The Fizzbuzz function", function() {
  var fizzbuzz;
  var result;

  beforeEach(function(){
    fizzbuzz = new Fizzbuzz;
  });

  it("returns 1 when passed a 1", function() {
    result = fizzbuzz.convert(1);
    expect(result).toBe(1);
  });

  it("returns 2 when passed a 2", function() {
    result = fizzbuzz.convert(2);
    expect(result).toBe(2);
  });

  it("returns Fizz when passed a 3", function() {
    result = fizzbuzz.convert(3);
    expect(result).toBe("Fizz");
  });

  it("returns Buzz when passed a 5", function() {
    result = fizzbuzz.convert(5);
    expect(result).toBe("Buzz");
  });

  it("returns Fizz when passed a multiple of 3", function() {
    result = fizzbuzz.convert(6);
    expect(result).toBe("Fizz");
  });

  it("returns Buzz when passed a multiple of 5", function() {
    result = fizzbuzz.convert(10);
    expect(result).toBe("Buzz");
  })


});
