# -*- coding: utf-8 -*-
"""
Created on Fri Apr  5 20:50:50 2019

@author: daily
"""

import random

def lotto():
    a = random.randint(1,2)
    if(a==1):
        return "win"
    elif(a==2):
        return "lose"

def calculate():
    print("당신의 승률은 : " , ((win)/(win+lose)))
    return print("Gg")
money = 10000
countlotto = 0
win = 0
lose = 0
while True:
    ip = eval(input("값을 입력해주세요. 홀수는 1, 짝수는 2를 입력하세요. 나가기는 3번입니다."))
    print(ip)
    print("카운트로또 : " ,countlotto)
    if(money>=10):
        if(ip!= 3):
            lotto()
            countlotto += 1
            money -= 500
            if(lotto()=="win"):
                print("승리!")
                win+=1
            else:
                print("패배!")
                lose+=1
        elif(ip==3):
            if(countlotto>=7):
                calculate()
                if((win/(win+lose))>=0.7):
                    print("상품받아가세요")
                    break
                else:
                    print("상품없습니다")
                    break
            else:
                print("상품없습니다")
                break
    else:
        print("나가")
        break
    