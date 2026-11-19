import os

def Pares(x,y):
    a=1
    y+=1
    print("Pares:")
    for j in range(x, y):
        if(j%2 == 0):
            print(f"{a}- {j}")
            a+=1

def Impares(x,y):
    a=1
    y+=1
    print("Impares:")
    for j in range(x, y):
        if(j%2 != 0):
            print(f"{a}- {j}")
            a+=1

def Pares_Impares(x,y):
    a=1
    b=1
    y+=1
    print("Pares:")
    for j in range(x, y):
        if(j%2 == 0):
            print(f"{a}- {j}")
            a+=1
    a=1
    print("Impares:")
    for j in range(x, y):
        if(j%2 != 0):
            print(f"{a}- {j}")
            b+=1



i=0
while(i==0):
    continuar=2  
    print("Mostrar os numeros pares ou impares")
    min_num = int(input("Deseja ver a partir do numero: "))
    max_num = int(input("Ate o numero: "))
    d=0
    while(d==0):
        print("1- Ver numeros Pares")
        print("2- Ver numeros Impares")
        print("3- Ver Pares e Impares")
        print("4- sair")
        opcao = int(input())
        os.system("cls")
        match opcao:
            case 1:
                Pares(min_num,max_num)

            case 2:
                Impares(min_num,max_num)

            case 3:
                Pares_Impares(min_num,max_num)

            case 4:
                d+=1
    while(continuar!=0 and continuar!=1):
        continuar = int(input("Deseja fazer uma nova operacao? \n1-Sim | 0-Nao\n"))
    
        if(continuar==0):
            i+=1

    os.system("cls")