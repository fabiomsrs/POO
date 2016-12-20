def nome():
    nome = input("Digite nome completo : ")
    
    print("Login = ", "".join([letra[0] for letra in nome.split()]))
    
   
        
def main():
    nome()

if __name__ == "__main__":
    main()
