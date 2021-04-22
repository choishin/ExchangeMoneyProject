package MoneyExchanger01;

import java.util.Scanner;

public class InputConsole {

	  public static Scanner scanner = new Scanner(System.in);
	   public double getWon() {
	   
		//환전하시오
		System.out.println("받은 원화 입력 : ");
		double won = scanner.nextDouble();
		return won;
		
	   }//getWon	

		   public  int getType() {
		//어떤 종류의 돈으로 환전할지 골라라
		System.out.println("환전할 종류 선택 (0: 종료, 1:USD, 2:EUR, 3:JPY)");
		int type = scanner.nextInt();
		return type;	

	}//getType

}//class
