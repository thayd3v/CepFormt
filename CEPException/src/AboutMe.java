import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;


public class AboutMe {
    public static void main(String[] args) {
 //criando o obejto scanner
        try{
     Scanner scanner = new Scanner (System.in).useLocale(Locale.US);

     System.out.println("Digite seu nome");
     String nome = scanner.next();


     System.out.println("Digite seu sobrenome");
     String sobrenome = scanner.next();
     
     System.out.println("Digite sua idade");
     int idade = scanner.nextInt();


     System.out.println("Digite sua altura");
     double altura = scanner.nextDouble();


     //imprimindo os dados obtidos pelo usuario 

        System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + "cm ");
        scanner.close();
        }



        catch (InputMismatchException e) {
            
            System.err.println("os campos idade e altura precisam ser numericos");

            /*O try consegue recuperar erros que possam ocorrer no código fornecido em seu bloco. 
            O catch por sua vez faz o tratamento dos erros que aconteceram. */
        }
    }
    
}
