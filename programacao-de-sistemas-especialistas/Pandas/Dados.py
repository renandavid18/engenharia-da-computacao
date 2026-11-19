import pandas as pd 

dados = {
    'Nome': ['Ana', 'Bruno', 'Carla'],
    'Idade': [23, 21, 25],
    'Cidade': ['Rio', 'SP', 'BH']
}

df = pd.DataFrame(dados)

print(df)