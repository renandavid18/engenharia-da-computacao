import os

i=0
d=0


while(i==0):
    continuar=2    
    print("Tabela Periodica:")
    num = int(input("Voce deseja ver a tabela de qual numero: "))
    min_tabela = int(input("Sua tabela comeca em: "))
    max_tabela = int(input("Sua tabela termina em: "))

    d = min_tabela
    
    os.system("cls")
    
    for j in range(min_tabela, max_tabela):
        valor = num * d
        print(f"{d} X {num} = {valor}")
        d+=1

    while(continuar!=0 and continuar!=1):
        continuar = int(input("Deseja fazer uma nova operacao? \n1-Sim | 0-Nao\n"))

        if(continuar==0):
            i+=1
    