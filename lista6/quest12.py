def nome():
    nome = input("Digite nome completo : ")
    print(nome.split()[len(nome.split()) - 1]+ "/" + nome.split()[0])
    
def main():
    nome()

if __name__ == "__main__":
    main()
