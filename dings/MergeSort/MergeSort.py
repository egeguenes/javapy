def main():
	myArray = ( 2 , 3 , 1213 , 2134 , 334134 , 123 , 12312 , 3123 )
	MergeSort(myArray)
	printArray(myArray)

def MergeSort(inputArray):
	inputLength = len(inputArray)
	midIndex = inputLength // 2

	for i in range(0, midIndex):
		leftHalf[i] = inputArray[i]

	for i in range(midIndex, inputLength):
		rightHalf[midIndex - i] = inputLength[i]

	MergeSort(leftHalf)
	MergeSort(rightHalf)

	Merge(inputArray , leftHalf , rightHalf)

def Merge(inputArray , leftHalf , rightHalf):
	leftSize = len(leftHalf)
	rightSize = len(rightHalf)

	i = 0
	j = 0
	k = 0

	while i < leftSize and j < rightSize:
		if leftSize[i] < rightSize[j]:
			inputArray[k] = leftHalf[i]
			i += 1
		else:
			inputArray[k] = rightHalf[j]
			j += 1
		k += 1

	while i < leftSize:
		inputArray[k] = leftHalf[i]
		i += 1
		k += 1

	while j < rightSize:
		inputArray[k] = leftHalf[j]
		j += 1
		k += 1

def printArray(arr):
	for i in arr:
		print(i)

if __name__ == "__main__":
	main()