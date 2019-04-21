def calcAlgo(n):
    cycle_length = 1
    while n != 1:
        n = 3*n + 1 if n%2 != 0 else n/2
        cycle_length += 1
    return cycle_length
raw = raw_input().split(' ')
if len(raw) != 2 or int(raw[0]) <= 0 or int(raw[1]) >= 1000000: exit()
i,j = [int(n) for n in raw]
maiorCiclo = 1
menorNum,maiorNum = sorted([i,j])
for n in range(menorNum,maiorNum+1):
    ciclo_len = calcAlgo(n)
    if ciclo_len > maiorCiclo: maiorCiclo = ciclo_len
print('{} {} {}'.format(i,j,maiorCiclo))