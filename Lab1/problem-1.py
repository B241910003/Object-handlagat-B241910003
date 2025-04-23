def tokenize(expression):
    return expression.replace('(', ' ( ').replace(')', ' ) ').replace('+', ' + ').replace('-', ' - ').replace('*', ' * ').replace('/', ' / ').split()

def interpret(expression):
    tokens = tokenize(expression)
    result = int(tokens[0])  
    
    for i in range(1, len(tokens), 2):  
        operator = tokens[i]
        operand = int(tokens[i+1])

        if operator == '+':
            result += operand
        elif operator == '-':
            result -= operand
        elif operator == '*':
            result *= operand
        elif operator == '/':
            result /= operand

    return result

def main():
    expression = input("Арифметик илэрхийлэл оруулна уу: ")
    result = interpret(expression)
    print("Үр дүн:", result)
    unittest.main()
    
import unittest

class TestInterpreter(unittest.TestCase):
    def test_addition(self):
        self.assertEqual(interpret("3 + 5"), 8)

    def test_subtraction(self):
        self.assertEqual(interpret("7 - 2"), 5)

    def test_multiplication(self):
        self.assertEqual(interpret("4 * 3"), 12)

    def test_division(self):
        self.assertEqual(interpret("8 / 2"), 4)

main()