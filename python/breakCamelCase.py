"""
Complete the solution so that the function will break up camel casing, using a space between words.
Example

"camelCasing"  =>  "camel Casing"
"identifier"   =>  "identifier"
""             =>  ""

***
def solution(s):
    return ''.join(' ' + c if c.isupper() else c for c in s)

***

"""
def breakCamelCase(word: str) -> str:
    breakedString = ""

    try:
        if word is None:
            breakedString = ""

        for letter in word:
            if letter.isupper():
                breakedString += " " + letter
            else:
                breakedString += letter
    except Exception as e:
        print(f"Ocurrió un error inesperado: {e}")
    
    return breakedString



if __name__ == "__main__":
    str1 = ""
    ans = breakCamelCase(str1)
    print(ans)

