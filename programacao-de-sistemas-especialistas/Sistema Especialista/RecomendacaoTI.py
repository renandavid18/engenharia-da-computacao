
print("====================================")
print("      SISTEMA ESPECIALISTA")
print("    RECOMENDAÇÃO DE ÁREA DE TI")
print("====================================")
 

areas = [
    "Desenvolvimento de Software",
    "Infraestrutura de TI",
    "Ciência de Dados",
    "Segurança da Informação"
]

respostas = [""]
 
print("\nEscolha uma área de interesse:")
 
print("1 -", areas[0])
print("2 -", areas[1])
print("3 -", areas[2])
print("4 -", areas[3])
 
opcao = int(input("\nDigite uma opção: "))
 

if opcao == 1:
    print("\nRecomendação:", areas[0])
 
elif opcao == 2:
    print("\nRecomendação:", areas[1])
 
elif opcao == 3:
    print("\nRecomendação:", areas[2])
 
elif opcao == 4:
    print("\nRecomendação:", areas[3])
 
else:
    print("\nOpção inválida.")
 
print("\nFim do sistema.")