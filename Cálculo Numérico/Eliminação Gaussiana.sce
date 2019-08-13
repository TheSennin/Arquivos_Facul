// Eliminação Gaussiana

clear all
clc

A = [1 1 1; 2 1 -1; 4 4 2];
b = [1;0;2];
Ab = [A b];
n = size(A,1);

disp("Matriz Ampliada = ")
disp(Ab)

for j=1:(n-1)
    for i=(j+1):n
        mij = Ab(i,j)/Ab(j,j)
        Ab(i,:) = Ab(i,:) - mij*Ab(j,:)
    end
end

disp("Matriz Escalonada: ")
disp(Ab)
