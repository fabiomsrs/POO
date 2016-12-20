def main():
    cont_led = 0
    N = int(input())
    
    for i in range(N):
        valor = input()
        for i in valor:
            if i == '0':
                cont_led += 6
            elif i == '1':
                cont_led += 2
            elif i == '2':
                cont_led += 5
            elif i == '3':
                cont_led += 5
            elif i == '4':
                cont_led += 4
            elif i == '5':
                cont_led += 5
            elif i == '6':
                cont_led += 6
            elif i == '7':
                cont_led += 3
            elif i == '8':
                cont_led += 7
            else:
                cont_led += 6
        print("%d leds" % cont_led)
        cont_led = 0
    
if __name__ == '__main__':
    main()
