package br.com.lipe;

public class Animal {
    private String cor;
    private String nome;
    protected String raca;
    protected String sexo;
    protected String tipo;

    public Animal(String tipo) {
        this.tipo = tipo;
    }



    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getTipo() {
        return tipo;
    }

    public String verTudo() {
        return " Raça: " + raca +
                " Tipo: " + tipo +
                " Sexo: " + sexo;
    }

    @Override
    public String toString() {
        return "Bicho{" +
                "cor='" + cor + '\'' +
                ", nome='" + nome + '\'' +
                ", sexo='" + sexo + '\'' +
                ", raca='" + raca + '\'' +
                '}';
    }
}
