
N, W = map(int, input().split())

input_lst = [list(map(int, input().split())) for _ in range(N)]


dp = [[0] * (W+1) for _ in range(N+1)]

for i in range(N):
    for w in range(1, W+1):
        if w < input_lst[i][0]:
            dp[i+1][w] = dp[i][w]
            continue
        dp[i+1][w] = max(dp[i][w], dp[i][w-input_lst[i][0]] + input_lst[i][1])

print(dp[N][W])
