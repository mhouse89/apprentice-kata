class Fizzbuzz(object):

    def convert(self, number):
        if(number % 15 == 0):
            return "FizzBuzz"
        if (number % 3 == 0):
            return "Fizz"
        elif(number % 5 == 0):
            return "Buzz"
        return number
