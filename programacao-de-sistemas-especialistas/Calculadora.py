import math
import os

def soma(x,r):
    print("\n======= Soma =======\n")
    y = int(input("Me informa o numero que ira somar com o anterior: "))

    r = x + y
    print("O resultado:")
    print(f"{x} + {y} = {r}")

    retornar=2
    while(retornar!=0 and retornar!=1):
        retornar = int(input("\n\nDeseja continuar a operacao a partir do resultado? \n1-Sim | 0-Nao\n"))
        
    if(retornar==1):
        return r

def subtracao(x,r):
    print("\n======= Subtracao =======\n")
    y = int(input("Me informa o numero que ira subtrair com o anterior: "))

    r = x - y
    print("Resultado:")
    print(f"{x} - {y} = {r}")

    retornar=2
    while(retornar!=0 and retornar!=1):
        retornar = int(input("\n\nDeseja continuar a operacao a partir do resultado? \n1-Sim | 0-Nao\n"))
        
    if(retornar==1):
        return r


def divisao(x,r):
    print("\n======= Divisao =======\n")
    y = int(input("Me informa o numero que ira dividir com o anterior: "))

    result = x / y
    print("Resultado:")
    print(f"{x} / {y} = {r}")

    retornar=2
    while(retornar!=0 and retornar!=1):
        retornar = int(input("\n\nDeseja continuar a operacao a partir do resultado? \n1-Sim | 0-Nao\n"))
        
    if(retornar==1):
        return r


def multiplicacao(x,r):
    print("\n======= Multiplicacao =======\n")
    y = int(input("Me informa o numero que ira multiplicar com o anterior: "))

    r = x * y
    print("Resultado:")
    print(f"{x} X {y} = {r}") 

    retornar=2
    while(retornar!=0 and retornar!=1):
        retornar = int(input("\n\nDeseja continuar a operacao a partir do resultado? \n1-Sim | 0-Nao\n"))
        
    if(continuar==1):
        return r


def raiz_quadrada(x,r):
    print("\n======= Raiz Quadrada =======\n")
    
    r = math.sqrt(x) 
    print("Resultado:")
    print(f"\u221a{x} = {r}")

    retornar=2
    while(retornar!=0 and retornar!=1):
        retornar = int(input("\n\nDeseja continuar a operacao a partir do resultado? \n1-Sim | 0-Nao\n"))
        
    if(retornar==1):
        return r


def potenciacao(x,r):
    print("\n======= Potenciacao =======\n")
    y = int(input("Me informa o expoente do desejado: "))


    r = x ** y
    print("Resultado:")
    print(f"{x}^{y} = {r}")

    retornar=2
    while(retornar!=0 and retornar!=1):
        retornar = int(input("\n\nDeseja continuar a operacao a partir do resultado? \n1-Sim | 0-Nao\n"))
        
    if(retornar==1):
        return r



i=0
while(i==0):
    print("================ Calculadora ================\n\n")
    num = int(input("Me informa o numero que deseja calcular: "))
    d=0
    result=0
    while(d==0):
        print("1- Somar")
        print("2- Subtrair")
        print("3- Dividir")
        print("4- Multiplicar")
        print("5- Raiz_quadrada")
        print("6- Potenciacao")
        print("7- Sair")

        opcao = int(input())
        os.system("cls")
        match opcao:
            case 1:
                soma(num)

            case 2:
                subtracao(num,result)

            case 3:
                divisao(num,result)

            case 4:
                multiplicacao(num,result)

            case 5:
                raiz_quadrada(num,result)

            case 6:
                potenciacao(num,result)

            case 7:
                d+=1
        print()
    while(continuar!=0 and continuar!=1):
        continuar = int(input("Deseja fazer uma nova operacao? \n1-Sim | 0-Nao\n"))
    
    if(continuar==0):
        i+=1

    os.system("cls")
    
