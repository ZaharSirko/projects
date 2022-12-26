from cmath import cos, pi
x = float(input("Enter x: "))
if -pi<=x and x<=pi:
    y= cos(3*x)
    print(y)
else:
    print("x must be: -pi<=x<=pi")


