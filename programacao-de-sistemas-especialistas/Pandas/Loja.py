import pandas as pd
 
# 1. Criando os dados da loja
dados = {
    "Produto": [ "Mouse", "Teclado", "Monitor", "Caderno", "Notebook", "Caneta"],
    "Categoria": ["Informática", "Informática", "Informática", "Papelaria", "Informática", "Papelaria"],
    "Quantidade": [10, 4, 3, 12, 2, 20],
    "Preco": [50.00, 100.00, 800.00, 15.00, 3500.00, 2.00]
}

# 2. Criar a tabela com Pandas
df = pd.DataFrame(dados)
 
print("=== TODOS OS PRODUTOS ===")
print(df)
print()

# 3. Calcular o valor total de cada venda
df["Total"] = df["Quantidade"] * df["Preco"]
 
print("\n=== VALOR TOTAL POR PRODUTO ===")
print(df[["Produto", "Quantidade", "Preco", "Total"]])
print()
 
# 4. Filtrar produtos de Informática
print("\n=== PRODUTOS DE INFORMÁTICA ===")
informatica = df[df["Categoria"] == "Informática"]
print(informatica)
print()

# 5. Produtos com vendas maior que 5
print("\n=== PRODUTOS COM MAIS DE 5 UNIDADES VENDIDAS ===")
maisVendidos = df[df["Quantidade"] > 5]
print(maisVendidos)
print()

# 6. Calcular o valor total das vendas
totalVendas = df["Total"].sum()
 
print("\n=== FATURAMENTO TOTAL ===")
print(f"R$ {totalVendas:.2f}")
print()

# 7. Encontrar produto com maior valor total de venda
indice = df["Total"].idxmax()
produtoDestaque = df.loc[indice]
print()

print("\n=== PRODUTO COM MAIOR VALOR TOTAL ===")
print("Produto:", produtoDestaque["Produto"])
print(f"Valor total: R$ {produtoDestaque['Total']:.2f}")
print()

# 8. Ordenar do maior para o menor valor total
ordenado = df.sort_values(by='Total', ascending=False)
print(ordenado)
print()

# 9.Exibir os produtos com preço acima de 100 reais
print("\n=== PRODUTOS COM PRECO ACIMA DE R$ 100,00  ===")
precoSuperior = df[df["Preco"] > 100]
print(precoSuperior)
print()

# 10. Calcular a media dos produtos
mediaPrecos = df["Preco"].mean()
print("\n=== MEDIA DOS PRECOS ===")
print(f"R$ {mediaPrecos:.2f}")
