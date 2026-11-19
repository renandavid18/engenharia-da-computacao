max = int(input("Voce deseja somar quantos numeros? "))

soma=0
print("Informe:")
for i in range(0, max):
    num = int(input(f"{i+1}- numero: "))
    soma+=num

print(f"A soma desses valores e: {soma}")