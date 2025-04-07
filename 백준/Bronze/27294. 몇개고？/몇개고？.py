def choice(a:int, b:int):
    if(a>=12 and a<=16 and b == 0):
            return 320
    else:
        return 280

if __name__ == "__main__":
    a, b = map(int, input().split())
    print(choice(a,b))