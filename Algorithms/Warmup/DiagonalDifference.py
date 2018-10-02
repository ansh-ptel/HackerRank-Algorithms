# https://www.hackerrank.com/challenges/diagonal-difference/problem
import math
n=raw_input()
n=int(n)
a=[]
for i in xrange(n):
    z=raw_input()
    z=z.split()
    for j in xrange(n):
        a.append(int(z[j]))
suml=0
x=0
for i in xrange(n):
    suml+=a[x]
    x+=(n+1)
sumr=0
x1=n-1
for i in xrange(n):
    sumr+=a[x1]
    x1+=(n-1)
print abs(suml-sumr)