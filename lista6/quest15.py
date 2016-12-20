def vertical(coluna, palavra):

    for letra in palavra:
        for i in range(coluna):
            print(end =" ")
        print(letra)

def main():
    palavra =input("Digite uma palavra: ")
    coluna = int(input("Digite a coluna: "))
    vertical(coluna, palavra)

if __name__ == "__main__":
    main()
