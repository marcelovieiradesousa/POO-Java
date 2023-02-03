package br.com.dio.desafio.dominio;
public enum Aula {
  VIDEO("video aula"),
  DES_PROJETO("desafio de projeto"),
  DES_CODIGO("desafio de código");
  
  private final String material;
  
  Aula(String material) {
      this.material = material;
  }
  
  public String getMaterial() {
      return material;
  }
}
