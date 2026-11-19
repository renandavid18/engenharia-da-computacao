print("======================================== \n        SISTEMA ESPECIALISTA \n      RECOMENDACAO DE LINGUAGEM\n========================================")

print("Qual ara voce deseja trabalhar?")
print("1- Analise de Dados")
print("2- Desenvolvimento Web")
print("3- Aplicativos Android")
print("4- Sistemas Corporativos")

op = int(input("Digite uma opcao: "))

if(op == 1):
    print("Recomendamos que voce aprenda a Linguagem Python")

elif(op == 2):
    print("Recomendamos que voce aprenda a Linguagem JavaScript")

elif(op == 3):
    print("Recomendamos que voce aprenda a Linguagem Java")

elif(op == 4):
    print("Recomendamos que voce aprenda a Linguagem Java")

else:
    print("Sera nescessario conhece-lo melhor para poder te recomendar uma linguagem")

print("\nSistema Encerrado!")