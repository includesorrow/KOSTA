# -*- coding: utf-8 -*-
"""
Created on Wed Apr  3 10:06:17 2019

@author: daily
"""

a = 10
a +=  1
print(a)
#a++, a--는 지원되지 않음.

#문자열은 작은 따옴표 또는 큰 따옴표로 감싼다.
a = "파이썬"
print(a)

#자료형이 없음(가변자료형)
a= 3
b=4
#3의 4승
a**b

#여러개의 변수에 할당 가능
a,b=10,20
print(a,b)
i=j=k=10
print(i,j,k)



##

#8진수와 16진수, 지수 표현
a = 4.24E10
print(a)
#8진수는 숫자가 0, 그다음에 영어 o가 들어와야 함
a = 0o177
print(a)

a = 0x8ff
print(a)