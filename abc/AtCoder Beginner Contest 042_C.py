import sys
N, K = map(int, input().split())
i_lst = list(map(str, input().split()))

while(True):
    flag = True
    for s in str(N):
        if s in i_lst:
            flag = False
            break
    if flag:
        print(N)
        break
    N = N + 1