import unittest
from app.Fizzbuzz import Fizzbuzz

class FizzbuzzTester(unittest.TestCase):

    def setUp(self):
        self.fizzbuzz = Fizzbuzz()
    def test_fizzbuzz_returns_1_when_passed_1(self):
        result = self.fizzbuzz.convert(1)
        self.assertEqual(1, result)
    def test_fizzbuzz_returns_2_when_passed_2(self):
        result = self.fizzbuzz.convert(2)
        self.assertEqual(2, result)
