print("======================================== \n        SISTEMA ESPECIALISTA \n      RECOMENDACAO DE AREA DE TI\n========================================")

print("Qual area voce mais se identifica")
print("1- Programacao")
print("2- Redes")
print("3- Analise de Dados")
print("4- Seguranca de Software")
print("5- Outra")

op = int(input("Digite uma opcao: "))

if(op == 1):
    print("Recomendamos a area de Desenvolvimento")

elif(op == 2):
    print("Recomendamos a area de Infraestrutura")

elif(op == 3):
    print("Recomendamos a area de Ciencia de Dados")

elif(op == 4):
    print("Recomendamos a area de Ciberseguranca")

elif(op == 5):
    print("Precisamos de mais informaçoes para poder recomendar uma área de TI")

else:
    print("Opcao Invalida\n(Selecionde de 1 a 5)")
print("\nSistema Finalizado!")