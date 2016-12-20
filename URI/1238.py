def main():
    numero = int(input())
    nova_cadeia = []
    for i in range(numero):
        cadeia = input().split()
        length = cadeia[0] if len(cadeia[0]) <= len(cadeia[1]) else cadeia[1]
        length2= cadeia[0] if len(cadeia[0]) > len(cadeia[1]) else cadeia[1]

        for j in range(len(length)):
            nova_cadeia += cadeia[0][j] + cadeia[1][j]
            
        if len(length) + len(length2) > len(nova_cadeia):
            nova_cadeia += length2[len(length): len(length2)]
        print("".join(nova_cadeia))
        nova_cadeia = []
            
    
   

        


if __name__ == '__main__':
    main()
