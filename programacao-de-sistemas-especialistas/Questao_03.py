print("======== Questao 03 ========")
num = int(input("Informe um numero Inteiro: "))

print("\nResultado:")
print(f"O Numero {num} e:")
if num > 0:
    print("Positivo")
elif num < 0 :
    print("Negativo")
elif num == 0:
    print("Igual a Zero")
if num % 2 == 0:
    print("Par")
else: 
    print("Impar")