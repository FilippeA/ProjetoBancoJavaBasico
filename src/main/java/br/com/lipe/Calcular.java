package br.com.lipe;

public class Calcular implements ExemploCalculadoraInterface{
    private int valorAtribuid = 10;
    private int resultado;

    @Override
    public void somar(int cu, int b) {
        resultado = cu + b+valorAtribuid;
    }

    @Override
    public Integer somarEResultado(int a, int b) {
        return 0;
    }

    @Override
    public void subtrair(int a, int b) {
        resultado = a - b-valorAtribuid;
    }

    @Override
    public void multiplicar(int a, int b) {
        resultado = a * b*valorAtribuid;
    }

    @Override
    public void dividir(int a, int b) {
        resultado = a / b/valorAtribuid;
    }

    @Override
    public void lucaoEputa(boolean tipo) {

    }

    @Override
    public Integer resultado() {
        return resultado;
    }
}
