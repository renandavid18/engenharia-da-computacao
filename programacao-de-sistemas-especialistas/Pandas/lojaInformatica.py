import pandas as pd

dados = {
    "Produto": ["Mouse", "Teclado", "Monitor", "Webcam", "Notebook", "Impressora"],
    "Categoria": ["Perifericos", "Perifericos", "Monitores", "Perifericos", "Computadores", "Impressao"],
    "Quantidade": [12, 4, 6, 3, 5, 2],
    "Preco": [45, 90, 750, 180, 3200, 650]
}

df = pd.DataFrame(dados)

df["ValorEstoque"] = df["Quantidade"] * df["Preco"]

df["Situacao"] = df["Quantidade"].apply(lambda x: "Estoque Baixo" if x < 5 else "Estoque Adequado")
print("=============================== Todos Produtos ===============================")
print(df[["Produto", "Categoria", "Quantidade", "Preco", "ValorEstoque", "Situacao"]])

perifericos = df[df["Categoria"] == "Perifericos"]
print("\n============================ Somente Perifericos ============================")
print(perifericos)

quantidadeBaixa = df[df["Quantidade"] < 5]
print("\n==================== Produtos com quantidade abaixo de 5 ====================")
print(quantidadeBaixa)

valorTotal = df["ValorEstoque"].sum()
print("\n========= Valor Total dos Produtos em Estoque =========")
print(f"R$ {valorTotal:.2f}")

produtoDeMaiorValor = df[df["ValorEstoque"] == df["ValorEstoque"].max()]
print("\n========= Produto de maior Valor =========")
print(produtoDeMaiorValor)