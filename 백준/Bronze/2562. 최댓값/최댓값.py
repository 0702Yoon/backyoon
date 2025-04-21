max = 0
for i in range(9):
    a = int(input())
    if(max<a):
        max = a
        max_index = i + 1 
print(max)
print(max_index)
