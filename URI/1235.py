def main():
    numero = int(input())

    for i in range(numero):
        palavra = input()
        new_palavra = []

        new_palavra += palavra[len(palavra) // 2 - 1 :: -1] + palavra[ :len(palavra) // 2 - 1: -1]

        print("".join(new_palavra))        
        
    
   

        


if __name__ == '__main__':
    main()
