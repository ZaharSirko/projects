a = float(input("Enter a: "))
b = float(input("Enter b: "))
c = float(input("Enter c: "))
d = pow(b,2)-4*a*c
if d==0:
    x1 = -b/(2*a)
    print("x1 = ",x1)
elif d>0:
    x1 = -b+pow(d,1/2)
    x2 = -b-pow(d,1/2)
    print("x1 = ",x1)
    print("x2 = ",x2)
else:
    print("D<0")