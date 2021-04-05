N = int(input())

h_lst = list(map(int, input().split()))
INF = 100000000
dp = [INF]*N

dp[0] = 0

for i in range(1, N):
    if i == 1:
        dp[i] = abs(h_lst[i-1]-h_lst[i])
    else:
        dp[i] = min(dp[i-1] + abs(h_lst[i]-h_lst[i-1]),
                    dp[i-2] + abs(h_lst[i] - h_lst[i-2]))

print(dp[N-1])
