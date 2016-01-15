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

});