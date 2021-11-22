package exercicios;

public class imc {
    public static void main(String[]args){
Double a, p, imc;
a= 1.75;
p= 95.5;
imc= p/(a*a);


if(imc < 18.5){
    System.out.println("seu peso é " +p);
    System.out.println("sua altura é  " +a);
    System.out.println("seu imc é  " +imc);
    System.out.println("você esta abaixo do peso.");
        }

         if (imc >= 18.5){
            System.out.println("seu peso é " +p);
            System.out.println("sua altura é  " +a);
            System.out.println("seu imc é  " +imc);
            System.out.println("você esta com peso normal");
        }
         if(imc >= 25.5){
            System.out.println("seu peso é " +p);
            System.out.println("sua altura é  " +a);
            System.out.println("seu imc é  " +imc);
            System.out.println("você esta acima do peso.");
        }
        if(imc >= 30.0){
            System.out.println("seu peso é " +p);
            System.out.println("sua altura é  " +a);
            System.out.println("seu imc é  " +imc);
            System.out.println("você tem obesidade classe 1.");
        }
        if(imc >= 35.0){
            System.out.println("seu peso é " +p);
            System.out.println("sua altura é  " +a);
            System.out.println("seu imc é  " +imc);
            System.out.println("você tem obesidade classe 2");
        }
         if(imc >= 40){
            System.out.println("seu peso é " +p);
            System.out.println("sua altura é  " +a);
            System.out.println("seu imc é  " +imc);
            System.out.println("você tem obesidade classe 3.");
        }
    }
}
