print("======== Questao 05 ========")
listaNumeros = [10]
d=0
somaPares=0
for i in range(0, 10):
    num = int(input(f"{i+1}- Numero: "))
    listaNumeros.append(num)

for j in range(0, 10):
    if(listaNumeros[j] % 2 == 0):
        somaPares += listaNumeros[j]
        d+=1

print("\nResultado:")
print(f"Quantidade de Numeros Pares: {d}")
print(f"Soma dos Numeros Pares: {somaPares}")