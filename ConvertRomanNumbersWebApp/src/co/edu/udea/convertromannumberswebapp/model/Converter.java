package co.edu.udea.convertromannumberswebapp.model;

import java.util.ArrayList;
import java.util.Arrays;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

public class Converter {

	private ArrayList<String> units;

	private ArrayList<String> tens;

	private ArrayList<String> hundreds;

	private ArrayList<String> thousands;

	public Response response;

	public Converter() {
		initComponents();
	}

	public Response ConverterToRomanNumber(String number) {
		response.setRequest(number);
		if (isEmpty(number) || containsLetters(number)
				|| indexOut("9999", number)) {
			response.setResponse("error");
			return response;
		}
		int aux = Integer.parseInt(number);
		int unit = aux % 10;
		int ten = (aux / 10) % 10;
		int hundred = (aux / 100) % 10;
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
		response.setResponse(result);
		return response;
	}

	public boolean isEmpty(String number) {
		if (number == null || number.equals("") || number.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}

	public boolean containsLetters(String number) {
		char aux;
		for (int i = 0; i < number.length(); i++) {
			aux = number.charAt(i);
			if (!(aux >= '0' && aux <= '9')) {
				return true;
			}
		}
		return false;
	}

	public boolean indexOut(String maxLimit, String number) {
		int num = Integer.parseInt(number);
		int max = Integer.parseInt(maxLimit);
		if (num > max) {
			return true;
		} else {
			return false;
		}
	}

	public void initComponents() {
		chargeUnits();
		chargeTens();
		chargeHundreds();
		chargeThousands();
		response = new Response();
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
		thousands = new ArrayList<String>(Arrays.asList("", "M", "MM", "MMM",
				"MMMM", "MMMMM", "MMMMMM", "MMMMMMM", "MMMMMMMM", "MMMMMMMMMM"));
	}
}
