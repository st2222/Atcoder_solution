S = input()

res = ''

for s in S:
    if s == '1':
        res += '1'
    elif s == '0':
        res += '0'
    elif s == 'B':
        if res != '':
            res = res[:len(res)-1]
print(res)
