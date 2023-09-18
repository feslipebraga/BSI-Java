package ex5;

public class Rica extends Pessoa {
    private double dinheiro;

    public Rica(String nome, int idade, double dinheiro) {
        super(nome, idade);
        this.dinheiro = dinheiro;
    }
    
    public void fazCompras(){
        System.out.println(this.getNome() + " está fazendo compras... 🛒");
    }
}
