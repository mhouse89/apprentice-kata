class FizzBuzz
  def self.convert(number)
    result = ''

    result += 'Fizz' if number % 3 == 0
    result += 'Buzz' if number % 5 == 0
    result = number if result.empty?
    result
  end
end
