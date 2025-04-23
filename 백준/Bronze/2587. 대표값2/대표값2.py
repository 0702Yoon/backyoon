a = int(input())
b= int(input())
c= int(input())
d= int(input())
e = int(input())

list = [a,b,c,d,e]
list.sort()
print((a+b+c+d+e)//len(list))
print(list[len(list)//2])