def linha_separada():
    frase = input("Digite uma frase: ")
    nova_frase = ""
    for letra in frase:
        nova_frase += letra + "\n"
    print(nova_frase)
    
def main():    
    linha_separada()


if __name__ == "__main__":
    main()
