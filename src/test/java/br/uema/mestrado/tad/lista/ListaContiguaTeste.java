package br.uema.mestrado.tad.lista;

import org.junit.Before;
import org.junit.Test;

public class ListaContiguaTeste {

  private Lista<String> strings;
  private static final int POSICAO_NAO_EXISTENTE = 100;
  private static final int TAMANHO_ESPERADO_APOS_INSERIR = 2;
  private static final int TAMANHO_ESPERADO_APOS_APAGAR = 2;

  @Before
  public void preparando() {
    strings = new ListaContigua<>();
  }

  @Test
  public void testInsercaoLista() {
    strings.inserir("novaString");
    strings.inserir("mais outra");

    assert (strings.tamanho() == TAMANHO_ESPERADO_APOS_INSERIR);
  }

  @Test
  public void testrecuperarComSucesso() {
    strings.inserir("string1");
    strings.inserir("string2");
    strings.inserir("string3");
    strings.inserir("string4");

    assert (strings.recuperar(3).equals("string4"));
  }

  @Test(expected = IllegalArgumentException.class)
  public void testRecuperarItemPosicaoInexistente() {
    strings.inserir("string1");
    strings.inserir("string2");
    strings.inserir("string3");
    strings.inserir("string4");

    strings.recuperar(POSICAO_NAO_EXISTENTE);
  }

  @Test
  public void testApagarComSucesso() {
    strings.inserir("string1");
    strings.inserir("string2");
    strings.inserir("string3");

    String deletada = strings.deletar(2);

    assert (deletada.equals("string3")
            && strings.tamanho() == TAMANHO_ESPERADO_APOS_APAGAR);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testeApagarItemPosicaoInexistente() {
    strings.inserir("string1");
    strings.inserir("string2");
    strings.inserir("string3");
    strings.inserir("string4");

    strings.deletar(POSICAO_NAO_EXISTENTE);
  }

  @Test
  public void testeDeletarLista() {
    strings.inserir("string1");
    strings.inserir("string2");

    strings.destruir();
    assert (strings.tamanho() == 0);
  }


}
