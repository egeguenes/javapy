def iterativeSearch(array, num):
    rounds = 0
    for i in range(0, len(array)):
        rounds += 1
        if array[i] == num:
            return i
    return -1

def binarySearch(array, n):
    a = 0
    b = len(array)
    counter = 0
    while a != b:
        counter = counter + 1
        m = int((a+b) / 2)
        if n <= array[m]:
            b = m
        else:
            a = m + 1
    if n == array[a]:
        return counter
    return -1