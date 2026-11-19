print("====================================")
print("      RECOMENDACAO DE AULA")
print("     ENCADEAMENTO PARA TRAS")
print("====================================")

textos = input("Voce tem dificuldades para compreender textos explicativos? (s/n)")
demonstracoes = input("Voce aprende melhor vendo demonstracoes? (s/n)")

if textos == "s":
    print("Voce aprende melhor vendo demonstracoes")

    if demonstracoes == "s":
        print("Você pode se beneficiar de video aulas!")
        print("\nCONCLUSAO")
        print("Existe a possibilidade de voce se benificar de video aulas")
        
    else:
        print("Voce nao precisa de demontracoes para aprender")
        
else:
    print("Voce aprende melhor com textos explicativos")
    print("Hipotese de se benificar de video aula nao confirmada")