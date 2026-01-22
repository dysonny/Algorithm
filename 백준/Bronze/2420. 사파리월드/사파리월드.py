N, M = input().split()

result = int(N) - int(M)

if result<0:
    result = -(result)
    print(result)
    
else:
    print(result)