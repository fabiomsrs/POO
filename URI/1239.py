def main():
    cont = 0
    cont1 = 0
    while True:
        new_text = ""
        try:
            text = input()
            cont = 0
            cont1 = 0
            for i in text:
                new_text += i             
                if i == "_" and cont % 2 == 0:
                    cont+=1
                    new_text = new_text.replace("_","<i>")
                elif i == "_" and cont % 2 != 0:
                    cont+=1
                    new_text = new_text.replace("_","</i>")
                elif i == "*" and cont1 % 2 == 0:
                    cont1+=1
                    new_text = new_text.replace("*","<b>")
                elif i == "*" and cont1 % 2 != 0:
                    cont1+=1
                    new_text = new_text.replace("*","</b>")
            
            print(new_text)
            
        except:
            break
            



    
if __name__ == '__main__':
    main()
