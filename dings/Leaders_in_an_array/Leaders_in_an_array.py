""" Given an array A of positive integers. Your task is to find the leaders in the array. 
	An element of array is a leader if it is greater than or equal to all the elements to its right side. 
	The rightmost element is always a leader. 
"""

def solution( arr , n ): # n = len(arr)
	nums = []
	nums.append(arr[n-1])
	sum_of_nums = 0
	for i in range(n-2 , -1 , -1):
		if arr[i] >= sum_of_nums:
			nums.append(arr[i])
		sum_of_nums += arr[i]
	nums.reverse()
	return nums

arr = [2 , 3 ,4 , 5 , 17 , 19]
result = solution(arr , len(arr))
print(result)