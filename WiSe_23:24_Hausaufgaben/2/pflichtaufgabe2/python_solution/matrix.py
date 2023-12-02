# a script to change matrixes, transposing, multiplication, addition 

def transpose(matrix):
    result = [[0] * len(matrix) for a in range(len(matrix[0]))]
    for i in range(len(matrix)):
        for j in range(len(matrix[i])):
            result[j][i] = matrix[i][j]
    return result

def add(matrix1, matrix2):
    if len(matrix1) == len(matrix2) and len(matrix1[0]) == len(matrix2[0]):
        result = [[0] * len(matrix1[0]) for a in range(len(matrix1))]
        for i in range(len(matrix1)):
            for j in range(len(matrix1[i])):
                result[i][j] = matrix1[i][j] + matrix2[i][j]
        return result
    else:
        print("Matrices are not of the same dimensions!")
        return None

def mult(matrix1, matrix2):
    if len(matrix1[0]) == len(matrix2):
        result = [[0] * len(matrix2[0]) for _ in range(len(matrix1))]
        for i in range(len(matrix1)):
            for j in range(len(matrix2[0])):
                for k in range(len(matrix2)):
                    result[i][j] += matrix1[i][k] * matrix2[k][j]
        return result
    else:
        print("The number of columns in matrix1 must be equal to the number of rows in matrix2.")
        return None

def print_matrix(matrix):
    for row in matrix:
        print(row)