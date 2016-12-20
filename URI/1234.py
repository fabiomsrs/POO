def main():
    while True:
        try:
            palavra = input()
            cont = 0
            new_palavra = []
            for i in palavra:
                if i >= 'a' and i <= 'z' or i >= 'A' and i <= 'Z':
                    if cont == 0 or cont % 2 == 0:
                        new_palavra += i.upper()
                    else:
                        new_palavra += i.lower()
                    cont += 1
                else:
                    new_palavra += i
            print("".join(new_palavra))
        except EOFError:
            break
   

        


if __name__ == '__main__':
    main()
