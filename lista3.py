def main():
        while 1 == 1:
                question = input("Questoes em scope: 4, 7, 10, 11, 14, 16, 20, 21, 23, 25: flag(Qualquer string fora do scope) ")
                if question == "4":
                    quest4()
                elif question == "7":
                    quest7()
                elif question == "10":
                    quest10()
                elif question == "11":
                    quest11()
                elif question == "14":
                    quest14()
                elif question == "16":
                    quest16()
                elif question == "20":
                    quest20()
                elif question == "21":
                    quest21()
                elif question == "23":
                    quest23()
                elif question == "25":
                    quest25()
                else:
                    confirm = input("Deseja sair(S/N)")
                    if confirm == "S" or confirm == "s":
                        break
                    else:
                        pass
                        

def quest4():
    numero = int(input("Digite numero: "))
    limite = int(input("Digite o Limite: "))
    razao = int(input("Digite a razão: "))
    print("Progressão Geometrica:")
    
    while numero < limite:
        print("%d"%numero)
        numero *= razao

def quest7():
    numero = int(input("Digite numero: "))
    soma = 0

    for i in range(2, numero):
        print("%d + %d"%(soma, i))
        soma += i
        
        
    print("Soma = %d"%soma)
        
def quest10():
    limite_superior = int(input("Digite Limite Superior: "))
    limite_inferior = int(input("Digite o Limite Inferior: "))
    print("Lista de Numeros impares:")
    
    for i in range(limite_inferior + 1, limite_superior):
        if i % 2 != 0:
            print("%d"%i)
            
    
def quest11():
    limite_superior = int(input("Digite Limite Superior: "))
    limite_inferior = int(input("Digite o Limite Inferior: "))
    cont_primo = 0
    print("Lista de Numeros Primos:")
    
    for i in range(limite_inferior + 1, limite_superior):
        for j in range(1,i+1):
            if i % j == 0:
                cont_primo += 1
        if cont_primo <= 2:
            print("%d"%i)
        cont_primo = 0

def quest14():
    numero = int(input("Digite um numero: "))

    for i in range(1, numero+1):
        if numero >= i*i:
            quadrado = i
    print("%d"%quadrado)

def quest16():
    Limite = int(input("Limite sequencial de fibonacci: "))
    N1 = 1
    N2 = 1
    for i in range(Limite):
        print("%d"%(N2 - N1))
        N2+=N1
        N1 = N2 - N1

def quest20():
    n = int(input("Digite um numero"))
    soma = 0
    
    for i in range(1, n+1):
        if i % 2 == 0 and i != 1:
            
            soma -= 1/i
            print("1/%d +"%i)
        else:
            soma += 1/i
            print("1/%d - "%i)

    print("Soma = %.2f"%soma)

def quest21():
    numerador = 1
    soma = 0
    for i in range(50):
        soma += (numerador) / (i+1)
        numerador+=2
        
    print("Soma = %.2f"%soma)

def quest23():
    while 1 == 1:
        codigo = int(input("Digite o Codigo: "))
        horas_trabalhadas = int(input("Digite quantidade de horas trabalhadas"))
        numero_dependentes = int(input("Digite o numero de dependentes"))

        salario_bruto = horas_trabalhadas * 12 + numero_dependentes *40
        salario_liquido = salario_bruto * 0.865

        print("Salario Bruto: %.2f\nINSS = %.2f\nIR = %.2f\nSalario Liquido = %.2f"%(salario_bruto,salario_bruto*0.085,salario_bruto*0.05,salario_liquido))
        parada = input("\n\nDeseja continuar(S/N)")
        print("\n")
        if parada == "N" or parada == "n":
            break
    
def quest25():
    import math
    candidato1 = 0
    candidato2 = 0
    candidato3 = 0
    voto_nulo = 0
    voto_branco = 0
    
    while 1 == 1:
        codigo = int(input("Vote 1 para 'Fulano', 2 para 'Cicrano', 3 para 'Fucicreudo, 9 = nulo, 0 = branco: "))
        if codigo == 1:
            candidato1 += 1
        elif codigo == 2:
            candidato2 += 1
        elif codigo == 3:
            candidato3 += 1
        elif codigo == 9:
            voto_nulo += 1
        elif codigo == 0:
            voto_branco += 1
        else:
            print("Voto Invalido")
        parada = input("Deseja calcular(S/N)")
        if parada ==  "S" or parada == "s":
            break

    print("Fulano recebeu %d votos"%candidato1)
    print("Cicrano recebeu %d votos"%candidato2)
    print("Fucicrano recebeu %d votos"%candidato3)
    print("Votos nulos = %d"%voto_nulo)
    print("Votos em branco = %d"%voto_branco)

    if candidato1 > candidato2 and candidato1 > candidato3:
        print("\n\nFulano Venceu")
    elif candidato2 > candidato1 and candidato2 > candidato3:
        print("\n\nCicrano Venceu")
    elif candidato3 > candidato2 and candidato3 > candidato1:
        print("\n\nFucicreudo Venceu")
    else:
        print("SEGUNDO TURNO")
    
    
if __name__ == "__main__":
    main()
