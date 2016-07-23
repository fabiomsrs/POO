def frase_sem_espaco():
    frase = input("Digite frase: ")
    nova_frase = ""

    for letra in frase:
        nova_frase += letra*2

    print(nova_frase)
    
def main():
    frase_sem_espaco()

if __name__ == "__main__":
    main()
