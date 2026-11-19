import requests
 
novo ={"title": "Aula de APIs", "body": "Teste", "userId": 1}
 
resposta = requests.post(
"https://jsonplaceholder.typicode.com/posts",
    json=novo, timeout=10)
 
print(resposta.status_code)# 201
print(resposta.json()["id"])# 101