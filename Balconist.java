import java.util.Scanner;

public class Balconist {
	public static boolean power;
	
	public static void main(String args[]) {
		Scanner keyboard = new Scanner(System.in);
		MovieTheater myCinema = null;
		Balconist.start();
		
		while(power) {
			System.out.println("Digite um comando.");
			System.out.print("User$: ");
			String cmd = keyboard.nextLine();
			
			String info[] = cmd.split(" ");
			
			if (info[0].equals("help")) {
				System.out.println("\t\t\t\tHelp\n"
						+ "\tinit + x = Inicia um(novo) cinema com x lugares cria, sobrescreve cinema anterior caso haja.\n"
						+ "\tres + Id(x) + Phone(y) + chrair(z)= Reserva um lugar para pessoa x com fone y na cadeira z.\n"
						+ "\tcancel + idx = Cancela rezerva do cliente x.\n"
						+ "\tstatus = Estado atual das cadeiras.\n"
						+ "\texit = Finaliza.");
			}
			else {

				int x =1; 
				switch(info[0]) {
				case "init":
					myCinema = new MovieTheater(info[1]);
					break;
					
				case "res":
					Client normalClient = new Client(info[1],info[2]);
					myCinema.reserv(normalClient, info[3]);
					break;
					
				case "cancel":
					myCinema.cancel(info[1]);
					break;
					
				case "status":
					if (myCinema != null) {
						myCinema.getChairs();
					} else {
						System.out.println("Falure: Crie um cinema antes!");
					}
					break;
					
				case "exit":
					Balconist.power = false;
					System.out.println("Até logo.");
					break;
					
				default:
					System.out.println("Comando não encontrado. Tente: \"help\".");
					break;
				}
			}
			
			
		}
	}
	public static void start() {
		Balconist.power = true;
		System.out.println("Olá, bem vido(a) ao cinema!\n");
	}
}