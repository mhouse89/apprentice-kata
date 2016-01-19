require_relative '../src/fizzbuzz'

describe FizzBuzz do

  describe ".convert" do
      context "given a 1" do
        it "returns 1" do
          expect(FizzBuzz.convert(1)).to eql(1)
        end
      end
    end

end
