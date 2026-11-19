print("================================\n     SISTEMA ESPECIALISTA\n   RECOMENDACAO DE LINGUAGEM \n================================")

print("Qual area voce deseja trabalhar?")
print("1- Analise de Dados")
print("2- Desenvolvimento Web")
print("3- Aplicativos Android")
print("4- Sistemas Corporativos")

op = int(input("Digite a opcao que mais se encaixa com voce:"))

if op == 1:
    print("Em base a sua escolha recomendamos a Linguagem Python")

elif op == 2:
    print("Em base a sua escolha recomendamos a Linguagem JavaScript")

elif op == 3:
    print("Em base a sua escolha recomendamos a Linguagem Java")

elif op == 4:
    print("Em base a sua escolha recomendamos a Linguagem Java")
    
else:
    print("Sera nescessario conhecer melhor seu objetivo!")

print("Encerrando o Sistema")