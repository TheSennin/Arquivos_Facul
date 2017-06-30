A = read("C:\users\GUSTAVO\Desktop\MatrizA.txt",4,4)

lin1 = 0
lin2 = 0
lin3 = 0
lin4 = 0
determinante = 0
i = 1
linplus0 = 0
for i=1:4
    for j=1:4
        if A(i,j) == 0 then
            if i == 1 then
                lin1 = lin1 + 1
            else
               if i == 2 then
                   lin2 = lin2 + 1
            else
                if i == 3 then
                    lin3 = lin3 + 1
            else
                if i == 4 then
                lin4 = lin4 + 1
                end
            end
        end
    end
end
end
end
    if lin1 > lin2 & lin1 > lin3 & lin1 > lin4 then
    linplus0 = 1;
else
    if lin2 > lin1 & lin2 > lin3 & lin2 > lin4 then
    linplus0 = 2;
else
    if lin3 > lin1 & lin3 > lin2 & lin3 > lin4 then
    linplus0 = 3;
else
    if lin4 > lin1 & lin4 > lin2 & lin4 > lin3 then
    linplus0 = 4;
if linplus0 == 0 then
    printf("Não há linhas com elementos nulos! \n")
else
printf("A linha com mais elementos nulos: %d \n",linplus0);
end
end
end
end
end
for a = 1:4
    if A(i,a) <> 0
        for b = 1:4
            for c = 1:4
                if b == i | c == a then
                    A2(b,c) = 0
                else
                    A2(b,c) = A(b,c)
                end
             end     
end
cont = 1
for p = 1:4
    for q = 1:4
        if p <> i &  q <> a then
        qq(cont) = A2(p,q)
        cont = cont + 1
    end
end
end
cont = 1
for p = 1:4-1
    for q = 1:4-1
        A3(p,q) = qq(cont)
        cont = cont + 1
    end
end
if (modulo(i+a,2) == 0) then
    t = 1
else 
    t = -1
end
determinante = determinante + (A(i,a)*t*(((A3(1,1)*A3(2,2)*A3(3,3)+A3(1,2)*A3(2,3)*A3(3,1)+A3(1,3)*A3(2,1)*A3(3,2))) - (A3(1,2)*A3(2,1)*A3(3,3)+A3(1,1)*A3(2,3)*A3(3,2)+A3(1,3)*A3(2,2)*A3(3,1))));
end
end
printf("Determinante usando Laplace: %d \n",determinante);
printf("Determinante calculado pelo scilab: %d \n", det(A));











