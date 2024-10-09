package br.com.lipe;

public class Reptil extends Animal {

    public Reptil(String tipo, String sexo, String raca) {// construtor
       super(tipo);
        this.raca = raca;
        this.sexo = sexo;
    }

    public Reptil(String tipo, String sexo){
        super(tipo);
        this.sexo = sexo;
    }
}
