####################################################################
#
# ex_syscall.asm
# 
# Autor: Cesar A. Zeferino
#
####################################################################
# EXEMPLOS DE USO DAS CHAMADAS DE SISTEMA NO PCSpim
# 
# No uso das chamadas de sistema deve-se utilizar $v0 para indicar 
# o código da chamada (serviço a ser realizado), $a0-$a3 para passar 
# os argumentos do serviço, e $v0 novamente para obter um valor
# de retorno, em chamadas que retornam algum valor.
#
# Chamadas de sistema que lidam com números expressos em ponto 
# flutuante utilizam $fp12 (argumento) e $f0 (retorno)
#
# Abaixo é apresentado um resumo das chamadas de sistemas. Mais 
# informações, incluindo os argumentos e o valor retornado em
# cada chamada  podem ser encontradas no Apêndice A do livro 
# Organização e Projeto de Computadores (seção SPIM, subseção 
# Chamadas de Sistema) de Patterson e Hennesy.
 
# Código   : Chamada
# $v0 =  1 : print_int 
# $v0 =  2 : print_float
# $v0 =  3 : print_double
# $v0 =  4 : print_string
# $v0 =  5 : read_int
# $v0 =  6 : read_float
# $v0 =  7 : read_double
# $v0 =  8 : read_string
# $v0 =  9 : sbkr
# $v0 = 10 : exit

# Para realizar uma chamada de sistema, após carregar o código
# da chamada e seus argumentos, deve-se executar o comando syscall

# NOTAS:
#
# Nota 1: 
# Para carregar valores imediatos em registradores, o exemplo
# utiliza a pseudo instrução "li reg, imed", que é traduzida para
# "ori reg, $zero, imed" pelo montador.
#
# Nota 2:
# Ao visualizar o conteúdo do segmentos de dados, considere
# que cada quatro caracteres da string (incluindo espaços e novas
# linhas) são aramzenados em uma única palavra de dados. Além disso
# o vallor visualizado na janela Data Segment cooresponde ao código
# ASCII de cada caracter (não ao caracter em si).
#
# Nota 3:
# Ao carregar o programa, para disparar a sua execução, pressione
# a tecla F5 (GO). Na caixa de diálogo Run Parameters, clique em
# OK. Um console de interface deverá ser apresentado para a 
# realização da entrada-e-saída de dados
#
####################################################################

   .data   # segmento de dados

newline:  .asciiz "\n"
Msg1:     .asciiz "\n\n Entre com um número: "
Msg2:     .asciiz "\n O número é: "
Msg3:     .asciiz "\n\n Pressione qualquer tecla "
Msg4:     .asciiz "\n\n Entre com uma string: "
Msg5:     .asciiz "\n A string é: "
buffer:   .asciiz ""


    .text   # segmento de código

main:

# EXEMPLO 1 - Solicitação e leitura de no. inteiro

      # PRINT_STRING
      li  $v0, 4                # chamada 4
      la  $a0, Msg1             # Msg1
      syscall                    

      # READ_INT
      li  $v0, 5                # chamada 5 
      syscall                    
      add $s0, $v0, $0          # salva $v0 em $s0


# EXEMPLO 2 - impressão do número lido (armazenado em $s0)

      # PRINT_STRING 
      li  $v0, 4                # chamada 4
      la  $a0, Msg2             # Msg2
      syscall                    

      # PRINT_INT
      li  $v0, 1                # chamada 1
      add $a0, $0, $s0		# $s0 = numero lido
      syscall                    


# EXEMPLO 3 - Solicitação e leitura de string

      # PRINT_STRING
      li  $v0, 4                # chamada 4
      la  $a0, Msg4             # Msg4
      syscall                    

      # READ_STRING
      li  $v0, 8                # chamada 8
      la  $a0, buffer           # $a0 = endereço do buffer de leitura
      li  $a1, 16               # $a1 = tamanho maximo do buffer de leitura
      syscall                    


# EXEMPLO 4 - impressao de string lida

      # PRINT_STRING
      li   $v0, 4               # chamada 4
      la   $a0, Msg5            # Msg4
      syscall                    

      # PRINT_STRING
      li   $v0, 4               # chamada 4
      la   $a0, buffer          # $a0 = endereço do buffer de leitura
      syscall                    


# EXEMPLO FINAL (getch = print_string + read_int)
 
      # PRINT_STRING (press...)
      li   $v0, 4               # chamada 4
      la   $a0, Msg3            # Msg1
      syscall                    

      # READ_INT
      li   $v0, 5               # chamada 5
      syscall                    



# FINALIZANDO O PROGRAMA
      # EXIT
      li $v0, 10                # chamada 10
      syscall                    

