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
    counter = 1
    while a != b:
        m = (a+b)//2
        if array[m] == n:
            return counter
        else:
            if n < array[m]:
                b=m
            elif n > array[m]:
                a = m+1
            else:
                pass
        counter += 1
    return -1