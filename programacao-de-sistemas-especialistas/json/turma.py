import json

turma = {
  "turma": "Sistemas Especialistas",
  "alunos": [{"nome": "Ana", "nota": 8.5},
    {"nome": "Bruno", "nota": 6.0},
    {"nome": "Carla", "nota": 9.0}
  ]
}

with open("turma.json", "w", encoding="utf-8") as arquivo:
    json.dump(turma, arquivo, ensure_ascii=False, indent=2)

with open("turma.json", "r", encoding="utf-8") as arquivo:
    dados = json.load(arquivo)

print("Turma:", dados["turma"])
print("\nLista de Alunos:")
for aluno in dados["alunos"]:
    print(f"- {aluno['nome']}: Nota {aluno['nota']}")
