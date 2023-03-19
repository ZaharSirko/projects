from cmath import cos, sin, sqrt, tan
a = int(input("Enter a: "))
b = int(input("Enter b: "))
operation = input("Enter \n +\n -\n *\n / \n ^\n sqrt\n sqrt3\ncos\n sin\n tan\n  ")
if operation == "+":
    print("a+b = ",a+b)
if operation == "-":
    print("a-b = ",a-b)
if operation == "*":
    print("a*b = ",a*b)
if operation == "/":
    if b==0:
        print("b = 0")
    else:
        print("a/b = ",a/b)
if operation == "^":
    if b<0:
        print("b < 0")
    else:
        print("a^b = ",pow(a,b))
if operation == "sqrt":
    print("sqrt(a) = ",sqrt(a),"\nsqrt(b) = ",sqrt(b))
if operation == "sqrt3":
    print("sqrt3(a) = ",pow(a,1/3),"\nsqrt3(b) = ",pow(b,1/3))
if operation == "cos":
    print("cos(a) = ",cos(a),"\ncos(b) = ",cos(b))
if operation == "sin":
    print("sin(b) = ",sin(a),"\nsin(b) = ",sin(b))
if operation == "tan":
    print("tan(a) = ",tan(a),"\ntan(b) = ",tan(b))