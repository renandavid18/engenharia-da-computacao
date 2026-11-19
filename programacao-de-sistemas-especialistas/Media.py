nota1 = int(input("Informe sua Primeira Nota: "))
nota2 = int(input("Informe sua Segunda Nota: "))

media = 0
media += (nota1 + nota2) / 2

print("\nStatus:")
print(f"\n1-Nota: {nota1} \n 2-Nota: {nota2} \n Media: {media}")
if(media >= 6): print("Situacao: APROVADO")
else: print(" Situacao: REPROVADO")