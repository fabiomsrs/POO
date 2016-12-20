def main():
    number = int(input())
    for i in range(number):
        string = input()
        new_string = []
        encrypt = []
        for i in range(len(string)):
            if string[i] >= "a" and string[i] <= "z" or string[i] >= "A" and string[i] <= "Z":
                new_string += chr(ord(string[i]) + 3)
            else:
                new_string += string[i]

        new_string = new_string[::-1]

        for i in range(len(new_string)):
            if i >= len(new_string) // 2:
                encrypt += chr(ord(new_string[i]) - 1)
            else:
                encrypt += new_string[i]

        print("".join(encrypt))
        
    
                
            

if __name__  == "__main__":
    main()
