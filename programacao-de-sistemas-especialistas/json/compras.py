import json

compras = {"mercado": "Feira do bairro", "itens": ["arroz", "feijão", "café"]}

compras["itens"].append("leite")

with open("compras.json", "w", encoding="utf-8") as arquivo:
    json.dump(compras, arquivo, ensure_ascii=False, indent=2)

with open("compras.json", "r", encoding="utf-8") as arquivo:
    dados = json.load(arquivo)


print("Mercado:", dados["mercado"])
print("Quantidade:", len(compras["itens"]), "\nItens:")
for itens in dados["itens"]:
    print(f"- {itens}")