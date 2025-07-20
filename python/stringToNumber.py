#!/usr/bin/python3

"""
We need a function that can transform a string into a number. What ways of achieving this do you know?

Note: Don't worry, all inputs will be strings, and every string is a perfectly valid representation of an integral number.

Examples
"1234" --> 1234
"605"  --> 605
"1405" --> 1405
"-7" --> -7
"""
# functions
def string_to_number(s):
    factor = 10
    number = 0

    for i in range(len(s)):
        if (s[(-1 * ( i + 1 ))] == '-'):
            number *= -1
            continue

        number += int(s[(-1 * ( i + 1 ))]) * (factor ** i)  
    return number

# main
if __name__ == "__main__":

    str = "1405"
    ans = string_to_number(str)
    print(ans)

