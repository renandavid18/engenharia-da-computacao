import pandas as pd

dados = {
    "Aluno": ["Ana", "Bruno", "Carla", "Diego", "Elisa", "Felipe"],
    "Disciplina": ["Python", "Python", "Banco de Dados", "Banco de Dados", "Python", "Banco de Dados"],
    "Nota1": [8, 5, 9, 4, 7, 6],
    "Nota2": [9, 6, 8, 5, 8, 7]
}

df = pd.DataFrame(dados)

df["Media"] = (df["Nota1"]+df["Nota2"])/2
df["Situacao"] = df["Media"].apply(lambda x: 'Aprovado' if x >= 7 else "Reprovado")

print("================= Alunos Cadastrados =================")
print(df[["Aluno", "Disciplina", "Nota1", "Nota2", "Media", "Situacao"]])


Python = df[df["Disciplina"] == "Python"]
print("\n======== Alunos De Python ========")
print(Python)


aprovados = df[df["Media"] >= 7]
print("\n======== Alunos Aprovados ========")
print(aprovados)


mediaTurma = df["Media"].mean()
print("\n======== Media total da turma ========")
print(f"{mediaTurma:.2f}")


alunoMaiorMedia = df[df["Media"] == df["Media"].max()]
print("\n======== Aluno com a Maior Media ========")
print(alunoMaiorMedia)