def pel(s: str):
    last = len(s)
    for i in range(last//2):
        if s[i] != s[last-i -1]:
            return 0
    return 1

if __name__ == "__main__":
    s = input()
    print(pel(s))
        