import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		System.out.println("Por favor, digite o numero da conta: ");
		int numero = sc.nextInt();
		
		System.out.println("Por favor, digite o numero da Agencia: ");
		String agencia = sc.next();
		
		System.out.println("Por favor, digite o nome do cliente: ");
		String nomeCliente = sc.next().toUpperCase();
		
		System.out.println("Por favor, digite o sobre nome do cliente: ");
		String sobreNomeCliente = sc.next().toUpperCase();
		
		System.out.println("Por favor, digite o saldo da conta: ");
		double saldo = sc.nextDouble();
		
		System.out.println("Olá "+nomeCliente+" "+sobreNomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo "+saldo+" já está disponível para saque\".");


	}

}
