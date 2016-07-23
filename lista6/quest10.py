def palindroma():
    palavra = input("Digite uma palavra: ")

    if palavra == palavra[::-1]:
        return "Palavra eh palindroma"

    return "Palavra n eh palindroma"


def main():
    print(palindroma())

if __name__ == "__main__":
    main()
