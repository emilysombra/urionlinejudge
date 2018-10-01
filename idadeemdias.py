quantidade_de_dias = int(input())
ano = quantidade_de_dias // 365
mes = (quantidade_de_dias % 365) // 30
dias = (quantidade_de_dias % 365) % 30

print(ano, "ano(s)")
print(mes, "mes(es)")
print(dias, "dia(s)")
