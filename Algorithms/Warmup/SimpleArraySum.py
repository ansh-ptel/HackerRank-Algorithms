# https://www.hackerrank.com/challenges/simple-array-sum/problem
n = int(raw_input())
a = raw_input().split()
s = 0
for i in xrange(len(a)):
    a[i] = int(a[i])
    s += a[i]
print s