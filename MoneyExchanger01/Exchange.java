package MoneyExchanger01;

import java.io.IOException;

public class Exchange {
	
	int exchangeResult1, exchangeResult2, exchangeResult3;
	int wonchange;
	int hund, fifty, ten, five, one;
	int eur500, eur200, eur100, eur50, eur20, eur10, eur5, eur1;
	int jpy5000,jpy2000,jpy1000,jpy500,jpy200,jpy100,jpy50,jpy20,jpy10,jpy5,jpy1;

	Output output = new Output();
	Remainder remainder = new Remainder();
	FileWrite filewrite = new FileWrite();
    ExchangeType ex = new ExchangeType();

	public void exchangeUSD () throws IOException  {

		//환전 계산과 원화로 거스름돈 줄 액수 구하기
	    exchangeResult1 = (int) (ex.won /ConstantValue.EX_RATE1);
		wonchange = (int) (ex.won- (exchangeResult1*ConstantValue.EX_RATE1));	
		//ExchangeType으로 보내기
		 ex.exchangeResult = exchangeResult1;
		 ex.wonchange = wonchange;

		//USD 몇 장씩 줘야
		hund = exchangeResult1/100;
		fifty = (exchangeResult1 -(100*hund))/50;
		ten = ((exchangeResult1 -(100*hund))-50*fifty)/10;
		five = (((exchangeResult1 -(100*hund))-50*fifty)-10*ten)/5;
		one = ((((exchangeResult1 -(100*hund))-50*fifty)-10*ten)-5*five)/1;

		//USD 출력하기
		output.PrintUSD(exchangeResult1, hund, fifty, ten, five, one);
		//남은 돈 한국돈으로 거슬러주기
		remainder.exchangeRemainder();
		//파일입력부로 이동
		filewrite.headwrite();
		filewrite.filewrite();
		filewrite.fileclose();

	}//exchangeUSD
	

	public void exchangeEURO () throws IOException {

		//환전 계산과 원화로 거스름돈 줄 액수 구하기
		exchangeResult2 = (int) (ex.won /ConstantValue.EX_RATE2);
		wonchange = (int) (ex.won- (exchangeResult2*ConstantValue.EX_RATE2));
		//ExchangeType으로 보내기
		 ex.exchangeResult = exchangeResult2;
		 ex.wonchange = wonchange;

		//euro 몇 장씩 줘야
		eur500 = exchangeResult2/500;
		eur200 = (exchangeResult2 -(500*eur500))/200;
		eur100 = ((exchangeResult2 -(500*eur500))-200*eur200)/100;
		eur50 = (((exchangeResult2 -(500*eur500))-200*eur200)-100*eur100)/50;
		eur20= ((((exchangeResult2 -(500*eur500))-200*eur200)-100*eur100)-50*eur50)/20;
		eur10= (((((exchangeResult2 -(500*eur500))-200*eur200)-100*eur100)-50*eur50)-20*eur20)/10;
		eur5= ((((((exchangeResult2 -(500*eur500))-200*eur200)-100*eur100)-50*eur50)-20*eur20)-10*eur10)/5;
		eur1= (((((((exchangeResult2 -(500*eur500))-200*eur200)-100*eur100)-50*eur50)-20*eur20)-10*eur10)-5*eur5)/1;

		//EURO 출력하기
		output.PrintEURO(exchangeResult2, eur500, eur200, eur100, eur50, eur20,eur10, eur5, eur1);
		//남은 돈 한국돈으로 거슬러주기
		remainder.exchangeRemainder();
		//파일입력부로 이동
		filewrite.headwrite();
		filewrite.filewrite();
		filewrite.fileclose();

	}//exchangeEURO


	public void exchangeJPY () throws IOException {

		//환전 계산과 원화로 거스름돈 줄 액수 구하기
		exchangeResult3 = (int) (ex.won /ConstantValue.EX_RATE3);
		wonchange = (int) (ex.won- (exchangeResult3*ConstantValue.EX_RATE3));
		//ExchangeType으로 보내기
		 ex.exchangeResult = exchangeResult3;
		 ex.wonchange = wonchange;

		//euro 몇 장씩 줘야
		jpy5000 = exchangeResult3/5000;
		jpy2000 = (exchangeResult3 -(5000*jpy5000))/2000;
		jpy1000 = ((exchangeResult3 -(5000*jpy5000))-2000*jpy2000)/1000;
		jpy500 = (((exchangeResult3 -(5000*jpy5000))-2000*jpy2000)-1000*jpy1000)/500;
		jpy100 = ((((exchangeResult3 -(5000*jpy5000))-2000*jpy2000)-1000*jpy1000)-500*jpy500)/100;
		jpy50 = (((((exchangeResult3 -(5000*jpy5000))-2000*jpy2000)-1000*jpy1000)-500*jpy500)-100*jpy100)/50;
		jpy10 = ((((((exchangeResult3 -(5000*jpy5000))-2000*jpy2000)-1000*jpy1000)-500*jpy500)-100*jpy100)-50*jpy50)/10;
		jpy5= (((((((exchangeResult3 -(5000*jpy5000))-2000*jpy2000)-1000*jpy1000)-500*jpy500)-100*jpy100)-50*jpy50)-10*jpy10)/5;
		jpy1= ((((((((exchangeResult3 -(5000*jpy5000))-2000*jpy2000)-1000*jpy1000)-500*jpy500)-100*jpy100)-50*jpy50)-10*jpy10)-5*jpy5)/1;

		//EURO 출력하기
		output.PrintJPY(exchangeResult3, jpy5000, jpy2000, jpy1000, jpy500, jpy100, jpy50, jpy10, jpy5, jpy1);
		//남은 돈 한국돈으로 거슬러주기
		remainder.exchangeRemainder();
		//파일입력부로 이동
		filewrite.headwrite();
		filewrite.filewrite();
		filewrite.fileclose();

	}//exchangeJPY


}//class