def main():
    numero = int(input())
    for i in range(numero):
        dic = {}
        array = []
        palavra = input().lower()
        for i in range(len(palavra)):
            if palavra[i] >= "a" and palavra[i] <= "z":
                dic[palavra[i]] = palavra.count(palavra[i])
                
        for j in dic:
            if dic[j] == max(dic.values()):
                array.append(j)
        array.sort()
        print("".join(array))
            
                
            
            
            

    
if __name__ == '__main__':
    main()
