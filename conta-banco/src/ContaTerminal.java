import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nome = entrada.nextLine();

        System.out.println("Digite o numero da conta: ");
        int numero = entrada.nextInt();

        System.out.println("Digite a agência: ");
        String agencia = entrada.next();

        System.out.println("Digite o valor do seu saldo: ");
        double saldo = entrada.nextDouble();


        System.out.printf("Olá, %s, obrigado por criar "
        + "um conta em nosso banco, sua agência é %s, conta %d e o seu saldo %.2f"
        + " já disponível para saque", nome, agencia, numero,  saldo);

        entrada.close();
    }
}
        


        

        

       






        





        
        
        
        
