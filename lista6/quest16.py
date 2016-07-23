def diagonal():
    palavra = input("Digite uma palavra: ")
    espaco = ""
    for letra in palavra:
        print(espaco + letra)
        espaco += " "
def main():
    diagonal()

if __name__ == "__main__":
    main()
