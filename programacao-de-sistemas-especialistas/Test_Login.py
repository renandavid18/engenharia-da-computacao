import os
import time

i = 0
j = 0

contas = ['renan', 'rn85', 'rd23', 'rs10', 'rnd76']
senhas = ['rn1920', 'rn2310', 'ren3723', 'ren2335']

while(i==0):
    seu_login = input("Digite seu login: ")

    if seu_login in contas:
        i+=1
    else:
        print("Login incorreto")

os.system("cls")

while(j==0):
    sua_senha = input(f"\nLogin: {seu_login}\nDigite sua senha: ")

    if sua_senha in senhas:
        j+=1
    else:
        print("Senha incorreta")

print(f"\nLogin: {seu_login}\nSenha: {sua_senha}\nLogando", end="")
for d in range(0, 3):
    print(".", end="", flush=True)
    time.sleep(1)

print("\n\nLogin efetuado com sucesso!")
