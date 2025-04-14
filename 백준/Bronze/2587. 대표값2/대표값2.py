def middle(a,b,c,d,e):
    array = [a,b,c,d,e]
    array.sort()
    return array[2]

if __name__ == "__main__":
    a = int (input())
    b =  int (input())
    c =  int (input())
    d =  int (input())
    e =  int (input())
    sum_result = a + b+c+ d +e
    print(sum_result//5)
    print(middle(a,b,c,d,e))
    