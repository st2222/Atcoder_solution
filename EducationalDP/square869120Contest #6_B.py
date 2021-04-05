N = int(input())
i_lst = [list(map(int, input().split())) for _ in range(N)]
start = sorted(list(map(lambda x: x[0], i_lst)))[N//2]
end = sorted(list(map(lambda x: x[len(x)-1], i_lst)))[N//2]

ssum = 0
for i in i_lst:
    ssum = ssum + abs(i[0] - start) + i[len(i)-1] - \
        i[0] + abs(i[len(i)-1] - end)

print(ssum)
