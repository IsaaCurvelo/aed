package br.uema.mestrado.lista3;

public class Q12 {

  // a questão deu a entender que era para se utilizar a passagem de argumentos por referência com o
  // uso de ponteiros. Entretanto, como tanto os tipos primitivos, quanto tipos imutáveis não sofrem
  // alterações no java, é impossível dentro do contexto de um método void modificar o valor de um double
  // ou de um Double, diferentemente de um outro tipo qualquer, como Date. Por esse motivo fiz a função
  // retornar double e não o void.

  public static double somaImposto(double taxaImposto, double custo) {
    custo = custo * (taxaImposto + 1d); // Não adianta de nada esta atribuição para o contexto do cliente
    return custo;
  }

  public static void main(String[] args) {
    Double taxaImposto = .3, custo = 100d;

    custo = somaImposto(taxaImposto, custo);
    System.out.println(custo);
  }

}
