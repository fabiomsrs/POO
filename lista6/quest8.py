def mudar_hora():
    hora = input("Digite a hora no formato hh:mm:ss ")
    nova_hora = ""
    for i in range(len(hora)):
        if i == 0:
            nova_hora += "hh " + hora[i:i+2:]+ ", "
        elif i == 3:
            nova_hora += "mm " + hora[i:i+2:]+ ", "
        elif i == 6:
            nova_hora += "ss " + hora[i::]
    print(nova_hora)
        
def main():
    mudar_hora()

if __name__ == "__main__":
    main()
