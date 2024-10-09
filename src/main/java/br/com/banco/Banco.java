package br.com.banco;

public class Banco {
  private int saldo;
  private int senha;

  public Banco() {
  }


    public String depositar(int valor) {
            saldo += valor;
            return "Depósito realizado com sucesso: "+valor;
    }

    public void sacar(int valor) {
        saldo -= valor;
    }

    public Integer verSaldo() {
        return saldo;
    }

}

/*
PUBLIC - A classe é visível para todos
PRIVATE - A classe é visível apenas dentro do próprio arquivo
PROTECTED - A classe é visível apenas dentro do mesmo pacote e para subclasses

void - não retorna nada

estrutura de método
modificador de acesso (public, private, protected)
tipo de retorno (void (não retorna nada), int, String, etc)
nome do método
parâmetros
corpo do método

return - retorna um valor
 */


