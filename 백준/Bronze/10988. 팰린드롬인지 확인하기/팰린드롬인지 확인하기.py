def is_palindrome(word: str)-> int:
    if word == word[::-1]:
        return 1
    else:
        return 0
 
if __name__ == "__main__":
    print(is_palindrome(input()))