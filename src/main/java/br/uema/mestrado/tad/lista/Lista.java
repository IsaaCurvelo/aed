package br.uema.mestrado.tad.lista;

public interface Lista<T> {

  void inserir(T item);

  T recuperar(int pos);

  T deletar(int pos);

  void destruir();

  int tamanho();
}
