package MoneyExchanger01;

import java.util.Scanner;

public class InputConsole {

	  public static Scanner scanner = new Scanner(System.in);
	   public double getWon() {
	   
		//ȯ���Ͻÿ�
		System.out.println("���� ��ȭ �Է� : ");
		double won = scanner.nextDouble();
		return won;
		
	   }//getWon	

		   public  int getType() {
		//� ������ ������ ȯ������ ����
		System.out.println("ȯ���� ���� ���� (0: ����, 1:USD, 2:EUR, 3:JPY)");
		int type = scanner.nextInt();
		return type;	

	}//getType

}//class
