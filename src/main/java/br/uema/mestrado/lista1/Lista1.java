package br.uema.mestrado.lista1;

public class Lista1 {
  /*
Universidade Estadual do Maranhão

Estrutura de Dados
Professor: Luís Carlos Costa Fonseca
Lista de Exercício 1


1. O que é um algoritmo?
É um conjunto finito de instruções que levam à solução de uma classe de problemas.

2. O que é um programa?
São algoritmos que podem ser executados em um computador.

3. Por que é importante construir programas de forma que implementações alternativas possam ser experimentadas?

4. O que pode mudar sensivelmente o tempo de execução de um programa?
O algoritmo escolhido para uma determinada tarefa.

5. Explique a diferença entre um programa correto e um programa eficiente?
O programa correto é aquele que sempre entrega o resultado correto do problema. O algoritmo eficiente é aquele que realiza a tarefa sem desperdiçar, ou com economia de recursos computacionais.

6. Um programa pode ser correto e eficiente ao mesmo tempo?
Sim, inclusive tem como medir o quão eficiente ele é com calculo de complexidade.

7. Como podemos medir o “custo” de um programa?
Em termos de espaço e tempo é possível com calculo de complexidade estimar o custo de um programa.

8. O que é um tipo abstrato de dados?
É uma abstração que utiliza geralmente tipos primitivos para modelar algo mais complexo.

9. O que é um ponteiro?
Ponteiro é uma referência para um endereço de memória.

10. Cite pelo menos duas utilizações para ponteiros.
- quando se necessita modificar o valor original de um argumento recebido em uma função;
- quando se quer alocar memória dinamicamente;

11. O que é endereço de memória?
É uma referência de um local físico na memória do computador.

12. Como você declara uma variável do tipo ponteiro em C/C++?
tipo *nome;

13. Como você declara uma variável de ponteiro do tipo “char”?
char *var_name;

14. Qual o resultado do programa abaixo:

#include<iostream.h>
int main()
{
    int a=3, b=5, c=2, *p, *q;
    p = &a;
    q = &b;
    c = *p + *q;
    cout<<"c = "<<c;
}
c = 8

15. Seja o seguinte trecho de programa:


int i=3,j=5;
int *p, *q;
p = &i;
q = &j;


Qual é o valor das seguintes expressões?

a) *p + *q = 8

b) *p - *q = -2

c)  3 + *p = 9

d)i + *p = 6

e)j + *q = 10
 

16. Qual o resultado do programa abaixo:

#include<iostream.h>
int main ()
{
    int num,valor;
    int *p;
    num=55;
    p=&num;
    valor=*p;
    cout<<"num = "<<valor;
    cout<<"Endereco para onde o ponteiro aponta: "<<p;
    cout<<"Valor da variavel apontada:"<<*p;
}

num = 55Endereco para onde o ponteiro aponta: 0x791b053c434cValor da variavel apontada:55


17. Qual o resultado do programa abaixo:

#include<iostream.h>
int main ()
{
int num,*p;
num=55;
p=&num;
cout<<"Valor inicial:"<<num;
*p=100;
cout<<"Valor final: "<<num;
}

Valor inicial:55Valor final: 100 */
}
