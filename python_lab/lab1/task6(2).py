inp_day = input('Введіть день тижня:') 
match inp_day: 
    case 'понеділок': 
        print("Сьогодні на роботу")
    case 'вівторок': 
        print("Сьогодні на роботу") 
    case 'середа': 
        print("Сьогодні на роботу") 
    case 'четвер': 
       print("Сьогодні на роботу") 
    case 'п’ятниця': 
        print("Сьогодні на роботу") 
    case 'субота' | 'неділя': 
        print('Сьогодні вихідний') 
    case _: 
        print("Такого дня не існує",inp_day)