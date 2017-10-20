#Problema atual: 1024
#Categoria: Strings

def crip1(str):
	crip = ""
	for c in str:
		if(c.isalpha()):
			cod = ord(c)
			cod += 3
			crip += chr(cod)
		else:
			crip += c
	
	return "".join(reversed(crip))

def crip2(str):
	crip = ""
	for i in range(len(str)):
		c = str[i]
		if(i >= len(str)/2 and len(str) % 2 == 0):
			c = ord(c) - 1
			c = chr(c)
		elif(i >= len(str)/2 -1 and len(str) % 2 != 0):
			c = ord(c) - 1
			c = chr(c)

		crip += c

	return crip
	
#solução:
n = int(input())
while(n > 0):
    entrada = input()
    entrada = crip1(entrada)
    entrada = crip2(entrada)

    print(entrada)
    n -= 1