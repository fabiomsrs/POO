def main():
    while True:
        string = input()
        if string == "0 0":
            break
        else:
            new_string = []
            for i in range(len(string)):
                if string[i] == string[0]:
                    new_string += ""
                else:
                    new_string += string[i]
            cont = 0
            for i in new_string:
                if i == "0":
                    cont += 1
            if len("".join(new_string).strip()) == cont or new_string == "":
                new_string = 0
                print(new_string)                
            else:
                new_string = int("".join(new_string).strip())
                print(new_string)
                
    
                
if __name__  == '__main__':
    main()
