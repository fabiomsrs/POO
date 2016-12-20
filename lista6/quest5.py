def mudar_data():
    data = input("Digite data no formato DD/MM/AAAA: ")
    if "/01/" in data:
        print(data.replace("/01/"," de janeiro de "))
    elif "/02/" in data:
        print(data.replace("/02/"," de fevereiro de "))
    elif "/03/" in data:
        print(data.replace("/03/"," de marco de "))
    elif "/04/" in data:
        print(data.replace("/04/"," de abril de "))
    elif "/05/" in data:
        print(data.replace("/05/"," de maio de "))
    elif "/06/" in data:
        print(data.replace("/06/"," de junho de "))
    elif "/07/" in data:
        print(data.replace("/07/"," de julho de "))
    elif "/08/" in data:
        print(data.replace("/08/"," de agosto de "))
    elif "/09/" in data:
        print(data.replace("/09/"," de setembro de "))
    elif "/10/" in data:
        print(data.replace("/10/"," de outubro de "))
    elif "/11/" in data:
        print(data.replace("/11/"," de novembro de "))
    elif "/12/" in data:
        print(data.replace("/12/"," de dezembro de "))
        
def main():
    mudar_data()

if __name__ == "__main__":
    main()
