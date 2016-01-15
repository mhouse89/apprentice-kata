function Fizzbuzz() {
  Fizzbuzz.prototype.convert = function (number) {
    if(number === 3) {
      return "Fizz";
    }
    return number;
  };
}
