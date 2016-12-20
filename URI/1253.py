def main():
    numero = int(input())
    
    for i in range(numero):
        nova_palavra = ""
        palavra = input().upper()
        cesar = int(input())

        for i in palavra:
            if ord(i) - cesar >= ord("A"):
                nova_palavra += chr(ord(i) - cesar)
            else:
                a = ord("A") - (ord(i) - cesar) 
                nova_palavra += chr(ord("[") - a) 
        print(nova_palavra)



    
if __name__ == '__main__':
    main()
