def confirm(tutples):
    a, b, c, d, e = tutples
    return (a**2 + b**2+c**2+d**2+ e**2) %10

if __name__=='__main__':
    result = confirm(tuple(map(int,input().split(" "))))
    print(result)