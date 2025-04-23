import unittest
from problem-1 import interpret

class TestInterpreter(unittest.TestCase):
    def test_addition(self):
        self.assertEqual(interpret("3 + 5"), 8)

    def test_subtraction(self):
        self.assertEqual(interpret("7 - 2"), 5)

    def test_multiplication(self):
        self.assertEqual(interpret("4 * 3"), 12)

    def test_division(self):
        self.assertEqual(interpret("8 / 2"), 4)

if __name__ == "__main__":
    unittest.main()