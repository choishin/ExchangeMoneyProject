package MoneyExchanger01;

import java.text.DecimalFormat;

public class Remainder {

	int wonchange,won10000,won5000,won1000,won500,won100,won50,won10,won5;
	ExchangeType ex = new ExchangeType();
	DecimalFormat decimal = new DecimalFormat("###,###,###,###,###");
	public void exchangeRemainder () {

		int won10000 = ex.wonchange/10000;
		int won5000 = (ex.wonchange-(won10000*100000))/5000;
		int won1000 = ((ex.wonchange-(won10000*100000))-won5000*5000)/1000;
		int won500 = (((ex.wonchange-(won10000*100000))-won5000*5000)-won1000*1000)/500;
		int won100 = ((((ex.wonchange-(won10000*100000))-won5000*5000)-won1000*1000)-won500*500)/100;
		int won50 = (((((ex.wonchange-(won10000*100000))-won5000*5000)-won1000*1000)-won500*500)-won100*100)/50;
		int won10 = ((((((ex.wonchange-(won10000*100000))-won5000*5000)-won1000*1000)-won500*500)-won100*100)-won50*50)/10;
		int won5 = (((((((ex.wonchange-(won10000*100000))-won5000*5000)-won1000*1000)-won500*500)-won100*100)-won50*50)-10*won10)/5;

		PrintRemainder(won10000,won5000,won1000,won500,won100,won50,won10,won5);

	}//exchangeRemainder

	public void PrintRemainder(int won10000, int won5000, int won1000,
			int won500, int won100, int won50, int won10, int won5) {
		System.out.println("*********************");
		System.out.println("��ȭ �Ž��� :"+ decimal.format(ex.wonchange) +"��");
		System.out.println("10,000�� : "+ won10000);
		System.out.println("5,000�� : "+ won5000);
		System.out.println("1,000�� : "+ won1000);
		System.out.println("500�� : "+ won500);
		System.out.println("100�� : "+ won100);
		System.out.println("50�� : "+ won50);
		System.out.println("10�� : "+ won10);
		System.out.println("5�� : "+ won5);
		System.out.println("1���� �������� �ʽ��ϴ�");
		System.out.println("*********************");
	}//printRemainder
}//class
