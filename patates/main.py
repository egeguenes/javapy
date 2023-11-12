from summe import *

arr = [2e8] + [1e7]
arr1 = [1e-7] * int(1e7)

arr2 = arr + arr1

sum1 = sumArray(arr2)
sum2 = sumArraySorted(arr2)

print(sum1)
print(sum2)

diff = sum2 - sum1

print(diff)