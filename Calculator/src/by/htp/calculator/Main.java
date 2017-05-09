package by.htp.calculator;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;


public class Main {

	public static void main(String[] args) {
		System.out.println("\n--- Calculator ---");
		String inFileName = "..\\inCalc.txt";
		String logFileName = "..\\log.txt";
		String tmpFileName = "..\\rezCalc.tmp";
		try {
			BufferedReader br = new BufferedReader(new FileReader(inFileName));
			Writer log = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(logFileName)));
			Writer rezCalc = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(tmpFileName)));
			try {
				String str;
				String[] splitStr = new String[2];
				float rez = 0f;
				while (br.ready()) {
					str = br.readLine();
					splitStr = str.split("[*+-/=]");
					
					int a = Integer.valueOf(splitStr[0].trim());
					int b = Integer.valueOf(splitStr[1].trim());
					String op = "";
					if (str.matches(".*[+].*")) {
						rez = a + b;
						op = " + ";
					} else if (str.matches(".*[-].*")) {
						rez = a - b;
						op = " - ";
					} else if (str.matches(".*[*].*")) {
						rez = a * b;
						op = " * ";
					} else if (str.matches(".*[/].*")) {
						rez = (float)a / (float)b;
						op = " / ";
					} 

					log.write("Read two digit and operator: " + a + op + b + "\n");
					log.write("Rezult: " + rez + "\n");
					System.out.println(a + op + b + " = "+ rez);
					log.write("Rezult print to console\n");
					rezCalc.write(a + op + b + " = "+ rez + "\r\n");
					log.write("Rezult print to file\n");
				}
				br.close();
				log.close();
				rezCalc.close();
				
				File inFile = new File(inFileName);
				inFile.delete();
				
				File tmp = new File(tmpFileName);
				tmp.renameTo(new File(inFileName));

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}

