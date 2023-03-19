login = "zahar"
password = "qweasd"
i = 1
inp_login = input("Enter login ")
inp_pass = input("Enter password ")
while i<=3:
    if inp_login==login and inp_pass==password:
        print("Авторизацію успішно пройдено з «№",i,"» спроби»")
        break
    i=i+1
    