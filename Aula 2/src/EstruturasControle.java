import java.util.Scanner;

public class EstruturasControle {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Nome " + nome);


        System.out.print("Digite sua Idade: ");
        int idade = Integer.parseInt(scanner.nextLine());

        if (idade >= 18){
            System.out.println("Maior de idade, pode entrar!");
        }else {
            System.out.println("Ainda não pode dirigir o carro do pai!");
        }




        //String nome = "JavaMan";
        //System.out.println("Olá " + nome);
        //System.out.printf("Olá " + nome);
    }
}

public static String Input
