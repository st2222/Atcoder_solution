
N = int(input())

input_lst = [list(map(int, input().split())) for _ in range(N)]

A = 0
B = 1
C = 2

dp = [[0] * 3 for _ in range(N)]

dp[0][A] = input_lst[0][A]
dp[0][B] = input_lst[0][B]
dp[0][C] = input_lst[0][C]


for i in range(1, N):
    dp[i][A] = max(dp[i-1][B] + input_lst[i][A], dp[i-1][C] + input_lst[i][A])
    dp[i][B] = max(dp[i-1][A] + input_lst[i][B], dp[i-1][C] + input_lst[i][B])
    dp[i][C] = max(dp[i-1][B] + input_lst[i][C], dp[i-1][A] + input_lst[i][C])

print(max(dp[N-1]))
