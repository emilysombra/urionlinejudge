#Problema atual: 1168
#Categoria: Strings

n = int(input())

while(n > 0):
    entrada = input()
    leds = 0
    num_leds = [6, 2, 5, 5, 4, 5, 6, 3, 7, 6]
    algs = ['0', '1', '2', '3', '4', '5', '6', '7', '8', '9']
    for c in entrada:
    	index = 0
    	for num in algs:
    		if(c == num):
    			leds += num_leds[index]
    			break
    		index += 1
    print("{} leds".format(leds))
    n -= 1