#!/usr/bin/python3

"""
In this Kata we are passing a number (n) into a function.

Your code will determine if the number passed is even (or not).

The function needs to return either a true or false.

Numbers may be positive or negative, integers or floats.

Floats with decimal part non equal to zero are considered UNeven for this kata.
><
"""

def is_even(n):
    ans = n % 2
    if ( len(str(ans)) > 3 or ans != 0 ):
        return False
    return True

if __name__ == "__main__":
    number = 0
    print(is_even(number))
