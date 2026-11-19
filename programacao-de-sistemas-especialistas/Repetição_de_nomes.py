print('Digite seu nome 10 vezes: ')
lista_nomes = []
for i in range(0, 10):
    nome = input("Digite seu nome: ")
    lista_nomes.append(nome)

print('\n')

for j in range(0, 10):
    print(f'{j+1}- Nome digitado foi: {lista_nomes[j]}')