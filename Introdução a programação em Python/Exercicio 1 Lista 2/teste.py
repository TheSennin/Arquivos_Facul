opc = 0
lista = []
while opc != 1:
    inp = int(input("Digite um numero: "))
    lista.append(inp)
    opc = int(input("Deseja adicionar mais um numero? 0-sim 1-nao"))


numeros = int(sum(lista))
media = numeros/len(lista)

print(media)