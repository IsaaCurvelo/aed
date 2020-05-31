package br.uema.mestrado.lista3;

public class Q13 {

  public static class Hora {
    private int horas, minutos;
    private char ampm;

    public Hora(int horas, int minutos) {
      this.horas = horas % 12;
      this.minutos = minutos;
      this.ampm = horas > 12 ? 'P' : 'A';
    }

    @Override
    public String toString() {
      return this.horas + ":" + this.minutos + " " + this.ampm + "M";
    }
  }

  public static void main(String[] args) {
    System.out.println(new Hora(22, 55));
    System.out.println(new Hora(10, 55));
  }

}
