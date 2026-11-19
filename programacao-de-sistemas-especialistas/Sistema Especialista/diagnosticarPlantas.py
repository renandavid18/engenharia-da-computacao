print("=======================================\n Diagnostico de Plantas \n=======================================")

murcha = input("As Folhas das Plantas estão Murchas? (S/N): ").lower()

if murcha == "s":
    terra = input("A Terra está Seca? (S/N): ").lower()
    if terra == "s":
        print("A Planta Precisa de Agua!")
    elif terra == "n":
        print("Verifique Excesso de Sol")
    else:
        print("Digite apenas S ou N")

elif murcha == "n":
    amarelas = input("As Folhas estao Amarelas? (S/N): ").lower()
    if amarelas == "s":
        print("Verifique excesso de Agua!")

        manchas = input("As Folhas tambem Apresentam Manchas? (S/N): ").lower()
        if manchas == "s":
            print("Verificar Presenca de Pragas!")
        elif manchas == "n": 
            print("Planta Aparentemente Saudavel!") 
        else:
            print("Digite apenas S ou N")

    elif amarelas == "n":    
        manchas = input("As Folhas Apresentam Manchas? (S/N): ").lower()
        if manchas == "s":
            print("Verificar Presenca de Pragas!")
        elif manchas == "n": 
            print("Planta Aparentemente Saudavel!") 
        else:
            print("Digite apenas S ou N")

else:
    print("Digite apenas S ou N")