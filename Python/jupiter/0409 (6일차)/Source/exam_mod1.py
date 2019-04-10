# -*- coding: utf-8 -*-
"""
Created on Tue Apr  9 10:18:14 2019

@author: daily
"""


def sum(a,b):
    return a + b

def check_sum(a,b):
    if type(a) != type(b):
        print("자료형이 다르기 때문에 계산을 못합니다.")
        return
    else:
        result = sum(a,b)
    return result
# 외부에서 python 실행파일.py 처럼 명령어를 실행하면 
# main() 함수가 자동으로 호출이 된다.
# class 안에서는 이런 메인함수를 정의하면 안된다.

if __name__=="__main__":
    print(sum(10,100))
    print(check_sum(3,5))
    print(check_sum(3,'te'))
    
    
    
    
    
    