opc = 0
lista = []
while(opc != 1):
    lista.append(int(input("Entre com valor: ")))
    opc = int(input("Deseja continuar inserindo? 0-sim 1-nao"))

numeros = sum(lista)
media = numeros/len(lista)

print(media)