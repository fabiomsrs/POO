def confirmacao_senha():
    senha = input("Digite senha: ")
    print(end="senha: ")
    for i in senha:
        print(end="*")
    confirmacao_senha = input("\nDigite confirmacao de senha: ")
    if senha == confirmacao_senha:
        return "senha correta"
    return "senha incorreta"


def main():
    print(confirmacao_senha())

if __name__ == "__main__":
    main()
