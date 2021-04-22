package MoneyExchanger01;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileWrite {
	private BufferedWriter bfw;
	private boolean isFileExist;
	
	public FileWrite() {
		try {
			File file = new File("C:\\Users\\최신\\Desktop\\test.csv");
			if(file.exists() == false) {
				isFileExist = false;
			} else {
				isFileExist = true;
			}
			bfw =new BufferedWriter(new FileWriter(file, true));					
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void headwrite() throws IOException {				
		
		if(isFileExist == false) {
			String head = "Date," + "ExchangeType," + "Amount," + "Result," + "Remainder" + "\n";
			bfw.write(head);
		}
	}

	public void filewrite() throws IOException {

		Date date = new Date(); 
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		ExchangeType ex = new ExchangeType();
		//1.날짜 
		String dateNow = format.format(date);
		System.out.println(dateNow);
		bfw.append(dateNow+",");
		//2.환전대상 
		String typeConvert ="";
		if(ex.type == 1 ) {
			typeConvert = "USD";
		}else if (ex.type == 2) {
			typeConvert = "EURO";
		}else if (ex.type == 3) {
			typeConvert = "JPY";
		}else {
			typeConvert = "null";
		}
		System.out.println("선택한 화폐 : "+typeConvert);
		bfw.append(typeConvert+",");
		//3.금액 
		double won = ex.won;
		String wonConvert = Double.toString(won);
		System.out.println("금액 : "+ wonConvert+"원");
		bfw.append(wonConvert+"원,");
		//4.환전결과(Exchange.) ->//5.거스름돈 (Remainder)
		String exchangeResultConvert = Integer.toString(ex.exchangeResult) ;
		String wonchangeConvert = Integer.toString(ex.wonchange) ;
		System.out.println("환전금액 : "+exchangeResultConvert+typeConvert);
		System.out.println("거스름돈 : "+wonchangeConvert+"원");
		System.out.println("*********************");
		bfw.append(exchangeResultConvert+typeConvert+",");
		bfw.append(wonchangeConvert+"원,");	
		bfw.newLine();

	}
	
	public void fileclose() {
		try {
			bfw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	


}
