def conversao_de_base():
    binario = input("Digite um numero em binario: ")
    decimal = 0
    potencia = 0
    for numero in binario[::-1]:
        decimal += (2 ** potencia) * int(numero)
        potencia += 1
    print(decimal)
    
def main():
    conversao_de_base()

if __name__ == "__main__":
    main()
