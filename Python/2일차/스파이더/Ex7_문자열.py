# -*- coding: utf-8 -*-
"""
Created on Wed Apr  3 11:17:38 2019

@author: daily
"""

#1. 큰따옴표 표기

str = '"Hello World"'
print(str)
str = 'Hello World'
str

str = """
여러줄 주석으로 사용하는 내용도 문자열로 
저장할 수 있다.

"""
str

# Multi Line Text
multiline = "Hello\nPython"
multiline

#작은 따옴표 3개 또는 큰따옴표 3개를 쓰면 여러 라인에 걸쳐 문자
multilie = '''hello
python'''
multilie

#문자열 연결
head = "파이썬은"
tail = "너무쉽다"
print(head+tail)

#문자열 곱하기
a = "파이썬"
print (a * 2)



lines="-"
print(lines * 10)

"""
===========

통계량 : 10000
============
"""
lines = "="
print(lines*50)
total = 1000
print("통계량 : ",total,lines*50)










