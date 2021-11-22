package exercicios;

public class lojinha {
    public static void main(String[]args){
        int itens;
        itens=15;
        double vi, desconto, valor_a_pagar, valor_desconto;

        vi= 1.99;
        valor_a_pagar=itens*vi;
        desconto=5*valor_a_pagar/100;
        valor_desconto=valor_a_pagar-desconto;

        System.out.println("o valor final sem desconto é:  " +valor_a_pagar );
        System.out.println("o valor com desconto é  " +valor_desconto);
    }
}
