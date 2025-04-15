def count_word(s:str):
    if s.strip() == "":
      return 0
    return len(s.strip().split(" "))

if __name__ == '__main__':
    s = input()
    print(count_word(s))