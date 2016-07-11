# coding:utf-8

def jo_sort(array):
    leng = len(array)
    i = 0
    j = leng - 1
    while (i < j):
        while ((array[i] % 2 ==1)  and i < leng):
            i = i + 1
        while  ((array[j] % 2 == 0) and j >= 0):
            j = j - 1
        if (i < j):
            array[i], array[j] = array[j], array[i]
    return array


print(jo_sort([1, 2, 3, 4, 6]))

