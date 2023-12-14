
def sumArray(array):
    summe = 0
    for i in range (0,len(array)):
        summe += array[i]
    return summe 

def sumArraySorted(array):
    array.sort()
    return sumArray(array)