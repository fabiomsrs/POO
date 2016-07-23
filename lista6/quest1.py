def criptografia_consoante():
    frase = input("Digite uma frase: ")
    frase_criptografada = ""
    for letra in frase.lower():
        print(letra)
        if letra > "a" and letra <= "z" and letra not in "aeiou":
            frase_criptografada += "#"
            continue
        frase_criptografada += letra
    print("Frase criptografada --> %s"% frase_criptografada.strip())
def main():    
    criptografia_consoante()


if __name__ == "__main__":
    main()
