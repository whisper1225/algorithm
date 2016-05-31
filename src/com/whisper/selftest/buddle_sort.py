# coding=utf-8
# sort by asc


def bubble_sort(array):
    length = len(array)
    for i in range(length):
        for j in range(0, length - i - 1):
            if (array[j] > array[j + 1]):  # if pre above follow then swap
                array[j], array[j + 1] = array[j + 1], array[j]
    return array


# test
print bubble_sort([5, 4, 3, 2, 1])


# i = 0 这一趟最大数能够到末尾,末尾位置正确,如果想要所有位置都正确 当然i需要跑到len-1因此是range(len)
# 内层循环的边界是
# 时间复杂度分析:
# 空间复杂度分析:
