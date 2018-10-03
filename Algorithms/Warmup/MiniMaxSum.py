# https://www.hackerrank.com/challenges/mini-max-sum/problem
z = map(int,raw_input().split())
z = sorted(z)
print z[0] + z[1] + z[2] + z[3], z[1] + z[2] + z[3] + z[4]