require_relative '../src/fizzbuzz'

describe FizzBuzz do
  describe '.convert' do
    context 'given a 1' do
      it 'returns 1' do
        expect(FizzBuzz.convert(1)).to eql(1)
      end
    end

    context 'given a 2' do
      it 'returns 2' do
        expect(FizzBuzz.convert(2)).to eql(2)
      end
    end

    context 'given a 3' do
      it 'returns Fizz' do
        expect(FizzBuzz.convert(3)).to eql('Fizz')
      end
    end

    context 'given a 5' do
      it 'returns Buzz' do
        expect(FizzBuzz.convert(5)).to eql('Buzz')
      end
    end

    context 'given a multiple of 3' do
      it 'returns Fizz' do
        expect(FizzBuzz.convert(6)).to eql('Fizz')
      end
    end

    context 'given a multiple of 5' do
      it 'returns Buzz' do
        expect(FizzBuzz.convert(10)).to eql('Buzz')
      end
    end

    context 'given a multiple of 3 and 5' do
      it 'returns Buzz' do
        expect(FizzBuzz.convert(60)).to eql('FizzBuzz')
      end
    end
  end
end
