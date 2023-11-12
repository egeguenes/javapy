from raten import *

patat = []
for i in range(0,32):
	patat.append(i*3)
print(binarySearch(patat,93))
print(iterativeSearch(patat,93))
