PI = 3.141592

class MyMath:
    def solv(self,r):
        #pi(d^2)
        return PI * (r ** 2)
    def sum(self,a,b):
        return a + b
    
    
    
if __name__ == "__main__":
    print("PI : ", PI)
    a = MyMath()
    print(a.solv(2))
    print(a.sum(PI,4.4))
    
    
    
