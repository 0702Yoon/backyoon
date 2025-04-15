def is_pal(word:str)-> int:
    if word == word[::-1]:
      return 1
    else:
        return 0
if __name__ == '__main__':
    word = input()
    print(is_pal(word))