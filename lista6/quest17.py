def substr(texto,comeco,qtd):
    sub_texto = texto[comeco:comeco+qtd]
    print(sub_texto)
def main():
    texto = input("Digite uma sentenca: ")
    substr(texto,2,5)

if __name__ == "__main__":
    main()
