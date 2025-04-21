n = int(input())
space = " "
star = "*"
for i in range(1,n+1):
    print(f"{space}" * (n-i) + f"{star}"* i)