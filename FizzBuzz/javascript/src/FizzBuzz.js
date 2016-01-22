var Fizzbuzz = function() {};

  Fizzbuzz.prototype.convert = function (number) {
    var result = '';

    if(number % 3 === 0) {
      result += "Fizz";
    }
    if (number % 5 === 0) {
      result += "Buzz";
    }
    if (!result) {
      result = number;
    }
    return result;
  };
