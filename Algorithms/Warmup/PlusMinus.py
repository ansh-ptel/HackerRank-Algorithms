# https://www.hackerrank.com/challenges/plus-minus/problem
n = raw_input()
n = int(n)
a = raw_input()
a = a.split()
zero = plus = minus = 0
for i in xrange(n):
    if (int(a[i])>0):
        plus += 1
    elif(int(a[i])==0):
        zero += 1
    else:
        minus += 1

print "%.6f"%(plus/float(n))
print "%.6f"%(minus/float(n))
print "%.6f"%(zero/float(n))