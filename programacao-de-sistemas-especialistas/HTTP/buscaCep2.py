import requests
 
def buscar_cep(cep):
    url = f"https://viacep.com.br/ws/{cep}/json/"
    resposta = requests.get(url, timeout=10)
    resposta.raise_for_status()# 400 vira erro
    dados = resposta.json()
    if dados.get("erro"):
        return None               # CEP não existe
    return dados
 
endereco = buscar_cep("01001000")
if endereco:
    print(endereco["logradouro"])
else:
    print("CEP não encontrado")