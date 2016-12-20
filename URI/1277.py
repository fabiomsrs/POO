def main():
    numero = int(input())
    
    for i in range(numero):
        num_est = int(input())
        array = []
        estudantes = input().split()
        frequencia = input().upper().split()
        
        for j in range(num_est):
            cont = frequencia[j].count("P")
            a = cont * 100 / (len(frequencia[j]) - frequencia[j].count("M"))
            if a < 75:
                array.append(estudantes[j])
        
        print(" ".join(array))
          

    
if __name__ == '__main__':
    main()
