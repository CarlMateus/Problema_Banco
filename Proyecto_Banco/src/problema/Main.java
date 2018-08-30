package problema;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*Un banco tiene 3 clientes que pueden hacer depositos y retiros
		 *Tambien el banco requiere que al final del dia calcule la cantidad de dinero que hay depositada*/
	
	Banco banco = new Banco();
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("-----------------------");
	System.out.print("Bienvenidos al banco xyz por favor ingrese una cuenta: ");
	int cuenta = sc.nextInt();
	String operacion = "";
	
	switch(cuenta) {
		case 1:
			System.out.println("Bienvenido " + banco.getPer1().getNombre());
			System.out.println("-----------------------");
			System.out.println("Ingrese la operacion a realizar: ");
			System.out.println("A-Depositar");
			System.out.println("B-Retirar");
			System.out.println("C-Revisar Saldo");
			operacion = sc.next();
			switch(operacion) {
				case "A":
					System.out.println("-----------------------");
					System.out.print("Ingrese el monto a depositar: ");
					double montoDeposito = sc.nextDouble();
					double montoAnteriorDeposito = banco.getPer1().getMonto();
					banco.getPer1().setMonto(montoAnteriorDeposito + montoDeposito);
					System.out.println("El monto final es: " + banco.getPer1().getMonto());
					break;
				case "B": 
					System.out.println("-----------------------");
					System.out.print("Ingrese el monto a retirar: ");
					double montoRetiro = sc.nextDouble();
					double montoAnteriorRetiro = banco.getPer1().getMonto();
					banco.getPer1().setMonto(montoAnteriorRetiro - montoRetiro);
					System.out.println("El monto final es: " + banco.getPer1().getMonto());
					break;
				case "C":
					System.out.println("Su saldo es de: " + banco.getPer1().getMonto());
					break;
			}
			break;
		case 2:
			System.out.println("Bienvenido " + banco.getPer2().getNombre());
			System.out.println("-----------------------");
			System.out.println("Ingrese la operacion a realizar: ");
			System.out.println("A-Depositar");
			System.out.println("B-Retirar");
			System.out.println("C-Revisar Saldo");
			operacion = sc.next();
			switch(operacion) {
				case "A":
					System.out.println("-----------------------");
					System.out.print("Ingrese el monto a depositar: ");
					double montoDeposito = sc.nextDouble();
					double montoAnteriorDeposito = banco.getPer2().getMonto();
					banco.getPer2().setMonto(montoAnteriorDeposito + montoDeposito);
					System.out.println("El monto final es: " + banco.getPer2().getMonto());
					break;
					
				case "B": 
					System.out.println("-----------------------");
					System.out.print("Ingrese el monto a retirar: ");
					double montoRetiro = sc.nextDouble();
					double montoAnteriorRetiro = banco.getPer2().getMonto();
					banco.getPer2().setMonto(montoAnteriorRetiro - montoRetiro);
					System.out.println("El monto final es: " + banco.getPer2().getMonto());
					break;
					
				case "C":
					System.out.println("Su saldo es de: " + banco.getPer2().getMonto());
					break;
				}
			
			break;
		case 3:
			System.out.println("Bienvenido " + banco.getPer3().getNombre());
			System.out.println("-----------------------");
			System.out.println("Ingrese la operacion a realizar: ");
			System.out.println("A-Depositar");
			System.out.println("B-Retirar");
			System.out.println("C-Revisar Saldo");
			operacion = sc.next();
			switch(operacion) {
				case "A":
					System.out.println("-----------------------");
					System.out.print("Ingrese el monto a depositar: ");
					double montoDeposito = sc.nextDouble();
					double montoAnteriorDeposito = banco.getPer3().getMonto();
					banco.getPer3().setMonto(montoAnteriorDeposito + montoDeposito);
					System.out.println("El monto final es: " + banco.getPer3().getMonto());
					break;
					
				case "B": 
					System.out.println("-----------------------");
					System.out.print("Ingrese el monto a retirar: ");
					double montoRetiro = sc.nextDouble();
					double montoAnteriorRetiro = banco.getPer3().getMonto();
					banco.getPer3().setMonto(montoAnteriorRetiro - montoRetiro);
					System.out.println("El monto final es: " + banco.getPer3().getMonto());
					break;
					
				case "C":
					System.out.println("Su saldo es de: " + banco.getPer3().getMonto());
					break;
			}
			break;
		
		case 0:
			System.out.println("Cuenta Banco");
			System.out.println("Cuenta Total del dia: ");
			System.out.println("Cuenta Total Persona1: " + banco.getPer1().getMonto());
			System.out.println("Cuenta Total Persona2: " + banco.getPer2().getMonto());
			System.out.println("Cuenta Total Persona2: " + banco.getPer3().getMonto());
			System.out.print(banco.getPer1().getMonto() + banco.getPer2().getMonto() + banco.getPer3().getMonto());
			break;
			
			
		default:
			System.out.println("Cuenta no Registrada");
			System.exit(0);
		
	}
	
	
	
	}

}
