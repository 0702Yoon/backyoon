def three(a:int, b:int):
    b_one = b % 10
    b_ten = b // 10 % 10
    b_hun = b  // 100 % 10
    three = a * b_one
    print(three)
    four = a * b_ten
    print(four)
    five = a * b_hun
    print(five)
    print(a * b)
if __name__ == "__main__":
    a = int(input())
    b = int(input())
    three(a, b)
