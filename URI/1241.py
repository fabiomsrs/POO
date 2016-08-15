def main():
    numero = int(input())
    
    for i in range(numero):
        palavra = input().split()

        length = palavra[0]
        length2 = palavra[1]
        
        if len(length) == len(length2):
            if length in length2:
                print("encaixa")
            else:
                print("nao encaixa")
        else:
            if len(length) < len(length2):
                print("nao encaixa")
            else:
                if length2 in length[len(length)-len(length2):]:
                    print("encaixa")
                else:
                    print("nao encaixa")
        



    
if __name__ == '__main__':
    main()
