import unittest
from app.Fizzbuzz import Fizzbuzz

class FizzbuzzTester(unittest.TestCase):
    def test_fizzbuzz_returns_1_when_passed_1(self):
        fizzbuzz = Fizzbuzz()
        result = fizzbuzz.convert(1)
        self.assertEqual(1, result)
