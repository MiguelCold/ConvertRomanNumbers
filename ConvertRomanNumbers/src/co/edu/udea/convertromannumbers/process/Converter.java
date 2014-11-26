package co.edu.udea.convertromannumbers.process;

import java.util.ArrayList;
import java.util.Arrays;

public class Converter {

	private ArrayList<String> units;
	private ArrayList<String> tens;
	private ArrayList<String> hundreds;
	private ArrayList<String> thousands;

	public Converter() {
		initComponents();
	}

	public String ConverterToRomanNumber(String number) {
		if( isEmpty(number) || containsLetters(number) || indexOut("9999", number)){
			return "error";
		}
		int aux = Integer.parseInt(number);
		int unit = aux % 10;
		int ten = (aux / 10) % 10;
		int hundred = (aux / 100)%10;
		int thousand = aux / 1000;
		String result = "";
		if (aux >= 1000) {
			result = ((String) thousands.get(thousand))
					.concat(((String) hundreds.get(hundred))
							.concat(((String) tens.get(ten))
									.concat((String) units.get(unit))));
		} else if (aux >= 100) {
			result = ((String) hundreds.get(hundred)).concat(((String) tens
					.get(ten)).concat((String) units.get(unit)));
		} else if (aux >= 10) {
			result = ((String) tens.get(ten)).concat((String) units.get(unit));
		} else {
			result = (String) units.get(aux);
		}
		return result;
	}
	
	public boolean isEmpty(String number){
		if(number.isEmpty() || number == null || number.equals("")){
			return true;
		}else{
			return false;
		}
	}

	public boolean containsLetters(String number){
		char aux;
		for(int i=0; i< number.length(); i++){
			aux = number.charAt(i);
			if(!(aux >='0' && aux<='9')){
				return true;
			}
		}
		return false;
	}
	
	public boolean indexOut(String maxLimit, String number){
		int num = Integer.parseInt(number);
		int max = Integer.parseInt(maxLimit);
		if(num >max){
			return true;
		}else{
			return false;
		}
	}
	
	public void initComponents(){
		chargeUnits();
		chargeTens();
		chargeHundreds();
		chargeThousands();
	}
	
	public void chargeUnits() {
		units = new ArrayList<String>(Arrays.asList("", "I", "II", "III", "IV",
				"V", "VI", "VII", "VIII", "IX"));
	}

	public void chargeTens() {
		tens = new ArrayList<String>(Arrays.asList("", "X", "XX", "XXX", "XL",
				"L", "LX", "LXX", "LXXX", "XC"));
	}

	public void chargeHundreds() {
		hundreds = new ArrayList<String>(Arrays.asList("", "C", "CC", "CCC",
				"CD", "D", "DC", "DCC", "DCCC", "CM"));
	}

	public void chargeThousands() {
		thousands = new ArrayList<String>(Arrays.asList("", "M", "MM", "MMM", "MMMM", "MMMMM", 
				"MMMMMM", "MMMMMMM", "MMMMMMMM", "MMMMMMMMMM"));
	}
}
