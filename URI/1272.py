def main():
    numero = int(input())
    
    for i in range(numero):
        palavra = input().split()
        new_palavra = ""
        for i in range(len(palavra)):
            new_palavra += palavra[i][0]
        print(new_palavra)
            

    
if __name__ == '__main__':
    main()
