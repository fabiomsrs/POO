def mudar_substr():
    texto = input("Digite uma sentenca: ")
    mudar = input("Digite substring a ser mudado: ")
    alterar = input("Digite substring a ser introduzida: ")
    print(texto.replace(texto[texto.rfind(mudar) : len(mudar) + texto.rfind(mudar)], alterar))
def main():
    mudar_substr()

if __name__ == "__main__":
    main()
