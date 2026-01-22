import sys

T = input()
T=int(T)

while True:
    a,b = sys.stdin.readline().rstrip().split()
    print(int(a)+int(b))
    T=T-1
    if T==0:
        break