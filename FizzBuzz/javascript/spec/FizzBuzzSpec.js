describe("The Fizzbuzz function", function() {
  var fizzbuzz;

  beforeEach(function(){
    fizzbuzz = new Fizzbuzz;
  });

  it("returns 1 when passed a 1", function() {
    var result = fizzbuzz.convert(1);
    expect(result).toBe(1);
  });

  it("returns 2 when passed a 2", function() {
    var result = fizzbuzz.convert(2);
    expect(result).toBe(2);
  });

});
