package br.uema.mestrado.tad.lista;

import java.util.Arrays;

public class ListaContigua<T> implements Lista<T> {

  private T[] itens;
  private int tamanho;

  public ListaContigua() {
    this.itens = (T[]) new Object[0];
    this.tamanho = 0;
  }

  @Override
  public void inserir(T item) {
    this.tamanho++;
    redimensionar();
    this.itens[tamanho - 1] = item;
  }

  @Override
  public T recuperar(int pos) {
    checarIndices(pos);
    return this.itens[pos];
  }

  @Override
  public T deletar(int pos) {
    checarIndices(pos);
    this.tamanho--;
    T ripado = this.itens[pos];
    this.itens[pos] = null;


    return ripado;
  }

  @Override
  public void destruir() {
    this.tamanho = 0;
    this.itens = (T[]) new Object[0];
  }

  @Override
  public int tamanho() {
    return this.tamanho;
  }

  private void checarIndices(int pos) {
    if (pos < 0)
      throw new IllegalArgumentException("a pos não pode ser menor que 0");
    if (pos >= tamanho)
      throw new IllegalArgumentException("a pos não pode ser maior ou igual ao tamanho da lista");
  }

  private void redimensionar() {
    this.itens = Arrays.copyOf(itens, tamanho);
  }
}
