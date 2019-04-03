# -*- coding: utf-8 -*-
"""
Created on Wed Apr  3 10:17:07 2019
exam1.py
@author: daily


#문제 1
김길동 학생의 과목별 점수
국어 : 80
영어 : 75
수학 : 55
평균점수를 구해서 출력



"""

g = 80
e = 75
m = 55
gem = g+e+m
gemmin = gem/3
print(gemmin)



"""
문제 2
주어진 자연수가 홀수인지 짝수인지 판별
"""

g2 = g%2
print(g2)

if(g%2 == 0):
    print('짝수')
else:
    print('홀수')
    
    
num = input('수를 입력')
if int(num)%2 == 0:
    print("짝수")
else:
   
    print("홀수")
    
    #input으로 저장된 변수의 기본 값은 str이기 때문에
    #int()정수로 변환해주어야만 연산이 가능하다.