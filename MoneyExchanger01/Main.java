package MoneyExchanger01;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException  {
		ExchangeType ex = new ExchangeType();

		do {
			InputConsole input = new InputConsole();
			ex.won = input.getWon();
			ex.type=input.getType();

			Exchange exchange = new Exchange();
			//1.�̱��޷�
			if (ex.type == ConstantValue.EX_type1) {	
				exchange.exchangeUSD();
			}
			//2.����ȭ
			else if (ex.type == ConstantValue.EX_type2) {
				exchange.exchangeEURO();
			}
			//3.��ȭ
			else if (ex.type == ConstantValue.EX_type3) {
				exchange.exchangeJPY();
			}

		}//do
			while (ex.type != ConstantValue.EX_type0);
	}//main

}//class
