package br.com.lipe;

public class AnimalPlay {
    public static void main(String[] args) {
//        Peixe peixe = new Peixe();
//        peixe.setRaca("Beta");
//        System.out.println(peixe.verTudo());
//
//
//        Felino felino = new Felino();
//        felino.setRaca("Siamês");
//        System.out.println(felino.verTudo());
//
//
//        Reptil reptil = new Reptil("Cobra", "Fêmea", "Python");
//        System.out.println(reptil.verTudo());

        Reptil reptil1 = new Reptil("Cobra", "Fêmea");
        reptil1.raca = "Python";
        reptil1.sexo = "Fêmea";
        System.out.println(reptil1.verTudo());

        reptil1.tipo = "Lagarto";
        System.out.println(reptil1.verTudo());
    }
}
