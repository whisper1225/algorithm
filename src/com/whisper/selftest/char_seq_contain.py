#coding:utf-8

'''
'''
def isContain(string,subString):
    leng = len(string)
    subLeng = len(subString)
    if(subLeng > leng):
        return False
    cmpCount = leng - subLeng
    for i in range(cmpCount + 1):
        j = 0
        for j in range(subLeng):
            if(subString[j] != string[i+j]):
                break
        if(j == subLeng -1):
            return True
    return False


print(isContain('welcome', 'come'))





