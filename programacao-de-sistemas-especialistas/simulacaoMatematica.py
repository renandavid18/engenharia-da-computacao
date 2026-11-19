import simpy
import random

# Configurações da simulação
numCaixas = 2
tempoServico = 5.0
intervaloChegada = 2.0

# Simula o atendimento de cada cliente
def cliente(env, nome, caixas):
    chegada = env.now
    print(nome, "entrou na fila no minuto", round(chegada, 1))

    # O cliente espera até algum caixa ficar livre
    with caixas.request() as pedido:
        yield pedido
        espera = env.now - chegada
        print(nome, "foi atendido depois de", round(espera, 1), "minutos")

        # Tempo que o cliente fica no caixa
        tempo = random.expovariate(1.0 / tempoServico)
        yield env.timeout(tempo)
        print(nome, "saiu no minuto", round(env.now, 1))


#Cria os clientes durante a simulação
def gerarClientes(env, caixas):
    numero = 1
    while True:

        #Define um tempo aleatório para a chegada do próximo cliente
        tempo = random.expovariate(1.0 / intervaloChegada)
        yield env.timeout(tempo)
        env.process(cliente(env, "Cliente-" + str(numero), caixas))
        numero += 1

# Início da simulação
print("==================== Simulação do supermercado ====================\n\n")
env = simpy.Environment()

# Define a quantidade de caixas funcionando
caixas = simpy.Resource(env, capacity=numCaixas)
env.process(gerarClientes(env, caixas))

#Simula 60 minutos
env.run(until=60)
print("\n\n==================== Simulação encerrada ====================")