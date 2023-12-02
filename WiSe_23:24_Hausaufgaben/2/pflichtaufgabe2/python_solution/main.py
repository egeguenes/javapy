from matrix import print_matrix, transpose, add, mult

a = [[0,0],[0,0],[0,0]]
b = [[0,0,0,0],[0,0,0,0],[0,0,0,0],[0,0,0,0]]
c = [[0,0,0,0],[0,0,0,0]]

for i in range(0,3):
	for j in range(0,2):
		a[i][j] = (i+1) * (j+1)

for i in range(0,4):
	for j in range(0,4):
		b[i][j] = (i+j+1) * 2

for i in range(0,2):
	for j in range(0,4):
		c[i][j] = 3 + i + j

print(transpose(a))

print(mult(a,b))

print(add(b,b))

print(mult(a,c))