from random import *
def quest2():
        numero1 = int(input("Digite Numero 1: "))
        numero2 = int(input("Digite Numero 2: "))
        multiplo = numero1 if numero1 > numero2 else numero2

        while multiplo % numero1 != 0 or multiplo % numero2 != 0:
                multiplo += 1
        print("MMC = %d"%multiplo)


def quest4():
        numero = float(input("Digite um numero: "))
        while numero >= 1:
                numero = numero / 2

        print("%.2f"%numero)
        
def quest5():
        numero1 = float(input("Digite Numero X: "))
        numero2 = float(input("Digite Numero N: "))  

        while numero2 >= 2:
                numero1 /= numero2
                numero2-=1
                print(numero1)

def quest7():
        numero = input("Digite um Numero ")
        match = input("Digite outro numero ")
        while match != numero:
                match = input("Digite outro numero ")
                if match == numero:
                        print("Numero iguais")
                        return 0
        print("Numero iguais")
def quest21():
        numero = int(input("Digite um Numero "))
        numero1 = int(input("Digite outro numero "))
        multiplicador = numero
        if numero != 0 and numero1 != 0:
                for i in range(numero1):
                        if i == 0:
                                continue
                        numero += multiplicador
        else:
                numero = 0
        print("Produto dos numeros %d"%numero)
        
def quest26():
        cont = 0
        contOtimo = 0
        media = 0
        qtdRegular = 0
        contBom = 0
        while 1 == 1:
                idade = int(input("Digite idade "))
                if idade == -1:
                        break
                cont +=1
                opniao = int(input("Digite opniao: 1 = otimo, 2 = bom, 3 = regular, 4 = pessimo "))
                if opniao == 1:
                        contOtimo +=1
                        media += idade
                if opniao == 3:
                        qtdRegular += 1
                if opniao == 2:
                        contBom +=1
        if contOtimo > 0:
                print("Media das idades que acharam Otimo %.2f"%(media/contOtimo))
        else:
                print("Ninguem Achou otimo")
        if qtdRegular > 0:
                print("Quantidade de pessoas que respondeu regular %d"%qtdRegular)

        else:
                print("Ninguem respondeu regular")
        if contBom > 0:
                print("Percentual de pessoas que respondeu Bom %.f"%(100 * contBom / cont))
        else:
                print("0% respondeu Bom")
                        

def quest28():
        numero = randint(1,101)
        cont = 0
        while 1 == 1:
                match = int(input("Digite um numero entre 1 e 100 "))
                cont+=1
                if match == numero:
                        print("Parabens!!! voce acertou em %d tentativas"%cont)
                        break
                else:
                        if numero > match:
                                print("Maior\n")
                        else:
                                print("Menor\n")
                        
                
                
                
def quest29():
        investimento_por_mes = int(input("Valor investido por mes: "))
        taxa_juros = int(input("Taxa de Juros mensal: "))
        taxa_mensal = investimento_por_mes
        cont_mes = 0
        ano = 1
        while 1 == 1:
                cont_mes+=1
                if cont_mes == 12:
                        print("Saldo do investimento apos um ano: %.2f"%investimento_por_mes)
                        confirm = input("Voce quer calcular o ano seguinte (S/N)")
                        if confirm == "s" or confirm == "S":
                                ano +=1
                                cont_mes = 0
                        else:
                                break
                investimento_por_mes += (investimento_por_mes * (taxa_juros/100) + taxa_mensal)
                
def quest30():
        while 1 == 1:
                nome_produto = input("Nome do Produto: ")
                if nome_produto == "FIM":
                        break
                preco = int(input("Preco do Produto: "))
                qtd_produto = int(input("Quantidade comprada: "))
                if qtd_produto <= 10:
                        print("Nota Fiscal %.2fR$"%(qtd_produto * preco))
                elif qtd_produto >= 11 and qtd_produto <= 20:
                        print("Nota Fiscal %.2fR$"%(qtd_produto * preco - (qtd_produto * preco)*0.1))
                elif qtd_produto >= 21 and qtd_produto <= 50:
                        print("Nota Fiscal %.2fR$"%(qtd_produto * preco - (qtd_produto * preco)*0.2))
                elif qtd_produto > 50:
                        print("Nota Fiscal %.2fR$"%(qtd_produto * preco - (qtd_produto * preco)*0.25))
                else:
                        print("Dados invalidos")
                        
        
def main():
        while 1 == 1:
                question = input("Questoes em scope: 2, 4, 5, 7, 21, 26, 28, 29, 30: flag(Qualquer string fora do scope) ")
                if question == "2":
                        quest2()
                elif question == "4":
                        quest4()
                elif question == "5":
                        quest5()
                elif question == "7":
                        quest7()
                elif question == "21":
                        quest21()
                elif question == "26":
                        quest26()
                elif question == "28":
                        quest28()
                elif question == "29":
                        quest29()
                elif question == "30":
                        quest30()
                else:
                        confirm = input("Deseja sair(S/N)")
                        if confirm == "S" or confirm == "s":
                                break
                        else:
                                pass
                        
        
        
if __name__ == "__main__":
        main()
                
                
