import random

def lotto(rr):
    a = random.randint(1,2)
    if(rr==a):
        return "win"
    elif(rr!=a):
        return "lose"
    
money = 10000
countlotto = 0
win = 0
lose = 0
while True:
    ip = eval(input("값을 입력해주세요. 홀수는 1, 짝수는 2를 입력하세요."))
    print(ip)
    print("카운트로또 : " ,countlotto)
    if(money>=10):
        if(ip== 1):
            lotto(ip)
            countlotto += 1
            money -= 500
            if(lotto(ip)=="win"):
                print("승리!")
                win+=1
            elif(lotto(ip)=="lose"):
                print("패배!")
                lose+=1
        elif(ip==2):
            lotto(ip)
            countlotto += 1
            money -= 500
            if(lotto(ip)=="win"):
                print("승리!")
                win+=1
            elif(lotto(ip)=="lose"):
                print("패배!")
                lose+=1
        else:
            if(countlotto>=7):
                print("당신의 승률은 : ",((win)/(win+lose)))
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
    
    
    