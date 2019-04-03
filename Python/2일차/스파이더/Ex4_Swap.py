# -*- coding: utf-8 -*-
"""
Created on Wed Apr  3 10:34:46 2019

@author: daily
"""

#변수의 swap

a = 1
b = 2
temp = a
a = b
b = temp
print("a : " , a , ", b", b)

#파이썬 형식으로 적용해보기
a = 1
b = 2
a,b = b,a
print("a : " , a , ",b : " ,b)
#a : 2 b : 1

#한번 더 해보기
a,b = 10,20
print(a, b)
a,b = b,a #서로 교차함
print(a,b)

del(b)
