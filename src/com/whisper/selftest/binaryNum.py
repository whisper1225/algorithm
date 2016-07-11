#coding:utf-8

'''
the num of binary
求一个int整数的二进制含有1的个数
'''

def binnaryNum(int):
    if(int == 0):
        return 0
    count = 1
    while(int & (int -1)): #核心代码 int  = int & (int -1) 但是Python语法支持
        int  = int & (int - 1)
        count +=1
    return count
print binnaryNum(7)
