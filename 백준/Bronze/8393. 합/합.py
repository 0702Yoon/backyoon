def sumsum(n):
    sum = 0
    for i in range(n+1):
        sum += i
    return sum
    
a = int(input())
print(sumsum(a))