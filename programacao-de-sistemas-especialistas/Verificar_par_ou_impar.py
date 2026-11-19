import os

def verificar_par_impar(x):
    if x % 2 == 0:
        print(f"O numero {x} e Par")
    else:
        print(f"O numero {x} e Impar")

i=0
while(i==0):
    continuar=2

    print("Verficar Par ou Impar\n\n")
    num = int(input("Informe o numero desejado: "))

    verificar_par_impar(num)

    while(continuar!=0 and continuar!=1):
        continuar = int(input("\n\nDeseja fazer uma nova operacao? \n1-Sim | 0-Nao\n"))
    
        if(continuar==0):
            i+=1

    os.system("cls")