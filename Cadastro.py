def cadastro_aluno():
    id_cadastro = 0
    id_cadastro += 1

    nome = input("Nome: ")
    idade = input("Idade: ")
    sexo = input("Sexo: ")
    return {"id" : id_cadastro , "Nome" : nome ,"Idade" : idade, "Sexo" : sexo}

def listar_aluno(cadastro):
    print("\n### Lista de Alunos ###\n")
    for i in range(len(cadastro)):
        print("Nome: " + cadastro[i].get("Nome").upper() + " Idade: " + cadastro[i].get("Idade")+ " Sexo: " + cadastro[i].get("Sexo").upper())
    print("\n\n")
    
def main():
    cadastro = []
    
    while True:
        print("***** CAD-ALUNOS *****")
        print("1 - Novo Aluno\n2 - Listar Alunos\n0 - Sair")
        funcao = input("Opcao >> ")
        if funcao == "1":
            cadastro.append(cadastro_aluno())
        elif funcao == "2":
            listar_aluno(cadastro)
        elif funcao == "0":
            break
        else:
            print("\nERROR XXXD\n")
            
            

if __name__ == "__main__":
    main()
