print("======== Questao 02 ========")
nome = input("Informe seu Nome: ")
nota1 = int(input("Informe sua Primeira Nota: "))
nota2 = int(input("Informe sua Segunda Nota: "))

media = 0
media += (nota1 + nota2) / 2

print("\nSeus Dados:")
print(f" Nome: {nome} \n 1-Nota: {nota1} \n 2-Nota: {nota2} \n Media: {media}")
if(media >= 7): print("Situacao: APROVADO")
else: print(" Situacao: REPROVADO")