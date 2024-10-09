package br.com.lipe;

 interface ExemploCalculadoraInterface {
    void somar(int cu, int b);

    Integer somarEResultado(int a, int b);

    void subtrair(int a, int b);
    void multiplicar(int a, int b);
    void dividir(int a, int b);

    void lucaoEputa(boolean tipo);

    Integer resultado();

}
