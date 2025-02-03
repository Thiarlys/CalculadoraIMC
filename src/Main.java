import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Calculadora de IMC");
        System.out.println("Qual o seu nome? ");
        String nome = input.nextLine();
        System.out.println("Olá " + nome + "!");
        System.out.println("Agora preciso saber qual o seu peso em quilos. ");
        double peso = input.nextDouble();
        System.out.println("E por fim, qual a sua altura? ");
        double altura = input.nextDouble();
        double imc = peso / (altura * altura);
        if (imc < 18.5) {
            System.out.println("Seu imc é " + imc + ". Oque é considera abaixo do peso. Procure um médico.");
        } else if ( imc >= 18.5 && imc <= 24.9 ) {
            System.out.println("Seu imc é " + imc + ". Seu peso esta em um nivel ideal." );
        } else if ( imc > 24.9 && imc <= 29.9 ) {
            System.out.println("Seu imc é " + imc + ". Você está um pouco acima do peso.");
        }else if ( imc > 29.9 && imc <= 39.9 ) {
            System.out.println("Seu imc é " + imc + ". Você tem obesidade. Procure um médico.");
        }else{
            System.out.println("Seu imc é " + imc + ". Você tem obesidade grave. Procure um médico com urgência.");
        }
    }
}