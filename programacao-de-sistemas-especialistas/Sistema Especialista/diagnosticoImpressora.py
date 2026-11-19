print("=======================================\n Diagnostico de Impressora \n=======================================")

funcionar = input("A impressora está funcionando normalmente? (S/N): ").lower()

if funcionar == "s":
        print("Diagnóstico: Impressora aparentemente funcionando normalmente")

elif funcionar == "n":
    ligar = input("A impressora está ligando? (S/N): ").lower()
    if ligar == "n":
        print("Diagnostico: Verifique o cabo de energia")
        continuar = input("A impressora voltou a ligar? (S/N): ").lower()
        if continuar == "n":
            print("Procure uma loja autorizada para verificar seu dispositivo")
        elif continuar == "s":
            print("Diagnostico FInalizado!")
        else:
            print("Digite apenas S ou N")
            
    elif ligar == "s":    
        imprimir = input("A impressora está imprimindo? (S/N): ").lower()
        if imprimir == "n":
            papel = input("Tem Papel na impressora? (S/N): ").lower()
            if papel == "n": 
                print("Diagnostico: Coloque o papel e verifique se ela voltou a funcionar!") 

            elif papel == "s":
                print("Diagnostico: Verifique a Conexao com o Computador!") 
                continuar = input("A impressora voltou a imprimir? (S/N): ").lower()
                if continuar == "s":
                    print("Diagnostico finalizado!")
                elif continuar == "n":
                    print("Procure uma loja autorizada para verificar seu dispositivo")
                else:
                    print("Digite apenas S ou N")
            else:
                print("Digite apenas S ou N")
        
        elif imprimir == "s":
            textoFraco = input("O texto da Impressora está Fraco? (S/N): ").lower()
            if textoFraco == "s":
                print("Diagnostico: Verifique o Nivel de Tinta") 
                continuar = input("A impressora voltou a funcionar? (S/N): ").lower()
                if continuar == "s":
                    print("Diagnostico finalizado!")
                elif continuar == "n":   
                    print("Procure uma loja autorizada para verificar seu dispositivo")
                else:
                    print("Digite apenas S ou N")

    else:
        print("Digite apenas S ou N")
else:
    print("Digite apenas S ou N")