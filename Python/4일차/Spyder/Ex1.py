# -*- coding: utf-8 -*-
"""
Spyder Editor

This is a temporary script file.
"""


# 명령형 매개 변수
# 아래 명령어를 입력한 후 d:/work/python/source/ex01.py 로 저장한다.
# sys 모듈을 import

import sys

#argv 명령행에서 입력한 인수들
args = sys.argv[1:]
for i in args:
    print(i.upper(), end = ' ')
    
print("")
a = [i.upper() for i in args]
print(",".join(a))
# 명령 프롬포트를 실행한 후 아래 명령어를 실행한다
# cd d:/work/python/source
# python ex01.py aaa bbb ccc
#                0    1   2
