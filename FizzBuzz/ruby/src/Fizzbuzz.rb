class FizzBuzz

  def self.convert(number)

    if number % 3 == 0
      return "Fizz"
    elsif number == 5
      return "Buzz"
    else
      return number
    end

  end
end
