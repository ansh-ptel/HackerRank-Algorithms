for _ in range(int(input())):
    a=[ord(i) for i in input()]
    if len(a)%2!=0:
        print(-1)
    else:
        b=a[:len(a)//2]
        c=a[len(a)//2:]
        b.sort()
        c.sort()
        print(sum([1 for i in range(len(b)) if b[i]!=c[i]]))

    
