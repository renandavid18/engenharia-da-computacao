print("======== Questao 04 ========")
print("Programa para mostrar a Tabuada de um Numero Inteiro")
num = int(input("Informe o Numero: "))

print("\n======== Tabuada ========")
for i in range(1, 11):
    print(f"{num} X {i} = {i*num}")