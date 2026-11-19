i=0
j=1
res=0
num = int(input("Informe Um numero: "))

print("Tabuada:")
while(i==0): 
    res = num*j
    print(f"{j} X {num} = {res}")
    
    if(j==10):
        i=1

    j += 1
