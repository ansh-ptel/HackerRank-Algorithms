# https://www.hackerrank.com/challenges/staircase/problem
n = int(raw_input())
a = ""
for i in xrange(n):
    a = ""
    b = ""
    for j in range(0,n-i-1):
        a += " "
    for j in xrange(0,i+1):
        b += "#"
    print a+b
        