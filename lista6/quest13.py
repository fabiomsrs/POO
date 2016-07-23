def nome():
    nome = input("Digite nome completo : ")
    mostrar_nome =[i.upper()[0] for i in nome.split()]
    
    print(nome.split()[len(nome.split()) - 1],end = " ")
    print(",".join(mostrar_nome[0:len(mostrar_nome) - 1]))
       
    
def main():
    nome()

if __name__ == "__main__":
    main()
