require_relative '../src/fizzbuzz'

describe FizzBuzz do

  describe ".convert" do
      context "given a 1" do
        it "returns 1" do
          expect(FizzBuzz.convert(1)).to eql(1)
        end
      end

      context "given a 2" do
        it "returns 2" do
          expect(FizzBuzz.convert(2)).to eql(2)
        end
      end

      context "given a 3" do
        it "returns Fizz" do
          expect(FizzBuzz.convert(3)).to eql("Fizz")
        end
      end

    end

end
