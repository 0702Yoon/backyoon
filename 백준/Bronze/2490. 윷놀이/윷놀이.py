def cal(a,b,c,d):
    sum = a + b + c + d
    if(sum==4):
        print('E')
    elif(sum==3):
        print('A')
    elif(sum==2):
        print('B')
    elif(sum==1):
        print('C')
    elif(sum==0):
        print('D')

a,b,c,d = map(int, input().split())
cal(a,b,c,d)
a,b,c,d = map(int, input().split())
cal(a,b,c,d)
a,b,c,d = map(int, input().split())
cal(a,b,c,d)