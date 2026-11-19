i=0
j=1
res=0



while(i==0): 
    num = int(input("Informe Um numero: "))
    res += num

    cont = input("Deseja continuar?")
    
    if(cont=="S") or (cont == "s"):
        continue
    print(f"A Soma de Todos os Numeros é: {res}")
    i += 1
