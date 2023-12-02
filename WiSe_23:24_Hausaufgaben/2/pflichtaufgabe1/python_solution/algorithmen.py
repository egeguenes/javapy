def isSorted(arr):
	return arr == sorted(arr)

def sort(arr):
	for i in range(len(arr)-1 , 1 , -1):
		for j in range(0 , i-1):
			if arr[j] > arr[j+1]:
				temp = arr[j]
				arr[j] = arr[j+1]
				arr[j+1] = temp
	return arr

def binarySearch(arr , n):
	a = 0
	b = len(arr)
	while a != 0:
		m = (a+b)//2
		if arr[m] == n:
			return True
		else:
			if n < arr[m]:
				b = m
			elif n > arr[m]:
				a = m + 1
			else:
				pass
	return False