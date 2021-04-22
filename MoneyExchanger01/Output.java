package MoneyExchanger01;

import java.text.DecimalFormat;

public class Output {

	int hund, fifty, ten, five, one;
	int eur500, eur200, eur100, eur50, eur20, eur10, eur5, eur1;
	int jpy5000,jpy2000,jpy1000,jpy500,jpy200,jpy100,jpy50,jpy20,jpy10,jpy5,jpy1;
	
	DecimalFormat decimal = new DecimalFormat("###,###,###,###,###");
	public void PrintUSD (int exchangeResult1, int hund, int fifty, int ten, int five, int one) {
		System.out.println("*********************");
		System.out.println("달러로 환전 결과");
		System.out.println("달러 지급 :"+ decimal.format(exchangeResult1) +"달러");
		System.out.println("100$ : "+ decimal.format(hund));
		System.out.println("50$ : "+ fifty);
		System.out.println("10$ : "+ ten);
		System.out.println("5$ : "+ five);
		System.out.println("1$ : "+ one);
	
	}//PrintUSD

	public void PrintEURO (int exchangeResult2, int eur500, int eur200, int eur100, 
			                               int eur50, int eur20, int eur10, int eur5, int eur1) {

		System.out.println("유로화로 환전 결과");
		System.out.println("유로화 지급 :"+ decimal.format(exchangeResult2) +"유로화");
		System.out.println("500 EURO : "+ decimal.format(eur500));
		System.out.println("200 EURO : "+ eur200);
		System.out.println("100 EURO : "+ eur100);
		System.out.println("50 EURO : "+ eur50);
		System.out.println("20 EURO : "+ eur20);
		System.out.println("10 EURO : "+ eur10);
		System.out.println("5 EURO : "+ eur5);
		System.out.println("1 EURO : "+ eur1);

	}//PrintEURO

	public void PrintJPY (int exchangeResult3, int jpy5000, int jpy2000, int jpy1000,
			         int jpy500, int jpy100, int jpy50, int jpy10, int jpy5, int jpy1) {

		System.out.println("엔화로 환전 결과");
		System.out.println("엔화 지급 :"+decimal.format(exchangeResult3) +"엔화");
		System.out.println("5,000 jpy : "+ decimal.format(jpy5000));
		System.out.println("2,000 jpy : "+ jpy2000);
		System.out.println("1,000 jpy : "+ jpy1000);
		System.out.println("500 jpy : "+ jpy500);
		System.out.println("100 jpy : "+ jpy10);
		System.out.println("50 jpy : "+ jpy50);
		System.out.println("10 jpy : "+ jpy10);
		System.out.println("5 jpy : "+ jpy5);
		System.out.println("1 jpy : "+ jpy1);

	}//PrintJPY

}//class