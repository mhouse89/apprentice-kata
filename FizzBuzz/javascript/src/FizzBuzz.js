function Fizzbuzz() {
  Fizzbuzz.prototype.convert = function (number) {
    if(number % 3 === 0) {
      return "Fizz";
    }
    else if (number === 5) {
      return "Buzz";
    }
    return number;
  };
}
