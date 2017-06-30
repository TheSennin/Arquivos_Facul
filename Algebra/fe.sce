A=read("C:\Users\GUSTAVO\Desktop\Matriz.txt",4,4)
for i=1:4
    soma=0
    cont=0
    for j=1:4
        soma = soma + abs(A(i,j))    
    end
    if (soma == 0.0) then
        printf("Linha %d \n",i)
        cont = cont + 1
     else
        printf("Linha não nula \n")    
    end
end
printf("Número de linhas nulas: %g \n",cont)

i=1
j=1

for m=1:4-i
    for n=1:4-j
     A2 = A(m,n)
     printf("%d \n",A2)
end
end
deterA = 
