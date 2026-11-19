print("=======================================\n Sistema Especialista - Suporte CLARO \n=======================================")
 
Sinal_Bom = input("Está com sinal de Internet? (s/n):  ").lower()
 
if Sinal_Bom == "n":
    luz = input("A luz de energia está apagada? (s/n):  ").lower()
    if luz == "s":
        print("Diagnóstico: Verificar o cabo de energia.")
    else:
        print("Diagnóstico: Verificar a fonte de alimentação.")
else: 
    monitor = input("O monitor está sem imagem? (s/n):  ").lower()
    if monitor == "s":
        print("Diagnóstico: Verificar a conexão do monitor.")
    else: 
        internet = input("A internet está funcionando?  (s/n):  ").lower()
        if internet == "n":
            print("Diagnóstico: Verificar a conexão de rede.")
        else:
            lento = input("O computador está lento? (s/n):  ").lower()
            if lento == "s":
                print("Diagnóstico: Verificar programas em execução.")
            else:
                print("Nenhum problema identificado.")