class ContaBancaria:

    saldo = 0

    def __init__(self):
        self.saldo = 0

    def consultaSaldo(self):
        return self.saldo

    def deposito(self, valor):
        self.saldo += valor

    def saque(self, valor):
        if valor > self.saldo:
            print("Saldo insulficiente, não é possível sacar!")
        else:
            self.saldo = self.saldo - valor


c = ContaBancaria()
opc = 0
while opc != 4:
    opc = int(input("Entre com a opcao: 1- Consulta Saldo, 2-Saque, 3-Deposito, 4-Sair"))
    if opc == 1:
        print(c.consultaSaldo())
    if opc == 2:
        c.saque(int(input("Entre com o valor a ser sacado: ")))
    if opc == 3:
        c.deposito(int(input("Entre com o valor a ser depositado: ")))
    if opc > 3 or opc <1:
        pass


