def fact(n):
    return 1 if n == 0 else n*fact(n-1)

def comb(n, x):
    return fact(n) / (fact(x) * fact(n-x))

def b(x, n, p):
    return comb(n, x) * p**x * (1-p)**(n-x)

# l, r = list(map(float, input().split(" ")))
# odds = l / r

for _ in range(int(input())):
    a=int(input())
    n=int(input())
    for _ in range(int(input())):
        p=float(input())
        print(sum([b(i,n,p) for i in range(a+1)]/))
