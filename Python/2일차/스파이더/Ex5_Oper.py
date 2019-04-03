# -*- coding: utf-8 -*-
"""
Created on Wed Apr  3 10:44:23 2019

@author: daily
"""

#나머지 연산자
print(7%3)
print(7/4) #1.75
#나눗셈 이 후 소수점 이하를 삭제
print(7//4)

#출력방식
x = 9
print("정수 1 : {}".format(x))
print("정수 2 : {0}".format(3**4))#문자열포멧
print("정수 3 : {0}".format(8.3/2.7))

#강제형변환을 해야겠다 하면
print("정수 3 : {0}".format(int(8.3)/int(2.7)))


#소수점 이하 자리수를 지정하는 방법
print("실수 1 : {0:.3f}".format(8.3/2.7))

y = 2.5 * 4.8
print(y)
#소수점 첫째자리로 변환해서 출력
r = 8/float(3)
print(r)

#소수점 4번째 자리로 변환해서 출력
print(round(r,4))
