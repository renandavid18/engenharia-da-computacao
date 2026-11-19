import requests
 
cep ="01001000"
url = f"https://viacep.com.br/ws/{cep}/json/"
 
resposta = requests.get(url, timeout=10)
print(resposta.status_code)# 200
 
dados =resposta.json()
print(dados["logradouro"])# Praça da Sé
print(dados["localidade"])# São Paulo
 