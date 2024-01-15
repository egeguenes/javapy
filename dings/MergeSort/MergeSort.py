def main():
	myArray = [ 123,123,435,667,788,7883,242,3 ]
	MergeSort(myArray)
	printArray(myArray)

def MergeSort(inputArray):
	inputLength = len(inputArray)

	if inputLength < 2:
		return

	midIndex = inputLength // 2
	leftHalf = [0] * midIndex
	rightHalf = [0] * ( inputLength - midIndex )

	for i in range(0, midIndex):
		leftHalf[i] = inputArray[i]

	for i in range(midIndex, inputLength):
		rightHalf[midIndex - i] = inputArray[i]

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
		if leftHalf[i] <= rightHalf[j]:
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
		inputArray[k] = rightHalf[j]
		j += 1
		k += 1

def printArray(arr):
	for i in arr:
		print(i)

if __name__ == "__main__":
	main()