print("====================================")
print("    DIAGNÓSTICO DE COMPUTADOR")
print("     ENCADEAMENTO PARA TRAS")
print("====================================")
 

energia = input("O computador esta recebendo energia? (s/n): ")
luz = input("Alguma luz do computador acende? (s/n): ")
liga = input("O computador liga? (s/n): ")

 
print("\nHipótese: problema de alimentacao")
 

if liga == "n":
    print("Regra 1 encontrada.")
    print("Se o computador nao liga,")
    print("entao pode existir problema de alimentacao.")
 
    if luz == "n":
        print("\nRegra 2 encontrada.")
        print("Se nenhuma luz acende,")
        print("entao o computador nao liga.")
 
        if energia == "n":
            print("\nRegra 3 encontrada.")
            print("Se o computador nao recebe energia,")
            print("entao nenhuma luz acende.")
 
            print("\nCONCLUSÃO:")
            print("Existe possibilidade de problema de alimentacao.")
        else: 
            print("\nNao foi possível confirmar o problema de alimentação.")
    else:
        print("\nNao foi possível confirmar o problema de alimentação.")
else:
    print("\nOcomputador liga.")
    print("A hipotese de problema de alimentação nao foi confirmada.")