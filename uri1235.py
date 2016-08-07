def main():
    array = []
    
    while True:
        maior = 0

        try: 
            palavra = input()
            sub_palavra = input()

            for i in range(len(palavra)):
                for j in range(i+1,len(palavra)):
                    
                    if palavra[i:j] in sub_palavra:
                        cont = len(palavra[i:j])
                        if cont > maior:
                            maior = cont
                    else:
                        continue
                    
            array.append(maior)

        except EOFError:
            break
        
    for k in array:
        print(k)
               
    
   

        


if __name__ == '__main__':
    main()
