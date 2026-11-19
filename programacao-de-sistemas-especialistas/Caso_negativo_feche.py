import time

print('Digite varios numeros')
print("Caso digite um numero negativo o programa vai fechar")

i=0

while(i>=0):
    i = int(input("Digite um numero: "))
    if(i>=0):
        print(f"O numero {i} nao e negativo")
    else:
        print(f"O numero {i} e negativo")
        print("Programa fechando", end="")

        for d in range(0, 3):
            print(".")
            time.sleep(1)
