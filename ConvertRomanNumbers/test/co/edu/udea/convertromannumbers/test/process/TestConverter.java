package co.edu.udea.convertromannumbers.test.process;

import static org.junit.Assert.*;

import org.junit.Test;

import co.edu.udea.convertromannumbers.process.Converter;

public class TestConverter {
	
	private Converter converter = new Converter();
	
	@Test
	public void TestConverterOne(){
		String result = converter.ConverterToRomanNumber("1");
		assertEquals("I", result);
	}
	
	@Test
	public void TestConverterTwo(){
		String result = converter.ConverterToRomanNumber("2");
		assertEquals("II", result);
	}
	
	@Test
	public void TestConverterThree(){
		String result = converter.ConverterToRomanNumber("3");
		assertEquals("III", result);
	}

	@Test
	public void TestConverterFour(){
		String result = converter.ConverterToRomanNumber("4");
		assertEquals("IV", result);
	}

	@Test
	public void TestConverterFive(){
		String result = converter.ConverterToRomanNumber("5");
		assertEquals("V", result);
	}

	@Test
	public void TestConverterSix(){
		String result = converter.ConverterToRomanNumber("6");
		assertEquals("VI", result);
	}

	@Test
	public void TestConverterSeven(){
		String result = converter.ConverterToRomanNumber("7");
		assertEquals("VII", result);
	}

	@Test
	public void TestConverterEigth(){
		String result = converter.ConverterToRomanNumber("8");
		assertEquals("VIII", result);
	}
	
	@Test
	public void TestConverterNine(){
		String result = converter.ConverterToRomanNumber("9");
		assertEquals("IX", result);
	}
	
	@Test
	public void TestConverterTeen(){
		String result = converter.ConverterToRomanNumber("10");
		assertEquals("X", result);
	}
	
	@Test
	public void TestConverterEleven(){
		String result = converter.ConverterToRomanNumber("11");
		assertEquals("XI", result);
	}
	
	@Test
	public void TestConverterNineTeen(){
		String result = converter.ConverterToRomanNumber("19");
		assertEquals("XIX", result);
	}
	
	@Test
	public void TestConverterTwentyOne(){
		String result = converter.ConverterToRomanNumber("21");
		assertEquals("XXI", result);
	}
	
	@Test
	public void TestConverterTwentyNine(){
		String result = converter.ConverterToRomanNumber("29");
		assertEquals("XXIX", result);
	}
	
	@Test
	public void TestConverterThirtyTwo(){
		String result = converter.ConverterToRomanNumber("32");
		assertEquals("XXXII", result);
	}
	
	@Test
	public void TestConverterFortyThree(){
		String result = converter.ConverterToRomanNumber("43");
		assertEquals("XLIII", result);
	}
	
	@Test
	public void TestConverterFiftyFive(){
		String result = converter.ConverterToRomanNumber("55");
		assertEquals("LV", result);
	}
	
	@Test
	public void TestConverterSixtySix(){
		String result = converter.ConverterToRomanNumber("66");
		assertEquals("LXVI", result);
	}
	
	@Test
	public void TestConverterSeventySeven(){
		String result = converter.ConverterToRomanNumber("77");
		assertEquals("LXXVII", result);
	}
	
	@Test
	public void TestConverterEightyEight(){
		String result = converter.ConverterToRomanNumber("88");
		assertEquals("LXXXVIII", result);
	}
	
	@Test
	public void TestConverterNinetyNine(){
		String result = converter.ConverterToRomanNumber("99");
		assertEquals("XCIX", result);
	}
	
	@Test
	public void TestConverterOneHundred(){
		String result = converter.ConverterToRomanNumber("100");
		assertEquals("C", result);
	}

	@Test
	public void TestConverterTwoHundred(){
		String result = converter.ConverterToRomanNumber("200");
		assertEquals("CC", result);
	}
	@Test
	public void TestConverterThreeHundred(){
		String result = converter.ConverterToRomanNumber("300");
		assertEquals("CCC", result);
	}
	@Test
	public void TestConverterFourHundred(){
		String result = converter.ConverterToRomanNumber("400");
		assertEquals("CD", result);
	}
	@Test
	public void TestConverterFiveHundred(){
		String result = converter.ConverterToRomanNumber("500");
		assertEquals("D", result);
	}
	@Test
	public void TestConverterSixHundred(){
		String result = converter.ConverterToRomanNumber("600");
		assertEquals("DC", result);
	}
	
	@Test
	public void TestConverterSevenHundred(){
		String result = converter.ConverterToRomanNumber("700");
		assertEquals("DCC", result);
	}
	@Test
	public void TestConverterEightHundred(){
		String result = converter.ConverterToRomanNumber("800");
		assertEquals("DCCC", result);
	}
	@Test
	public void TestConverterNineHundred(){
		String result = converter.ConverterToRomanNumber("900");
		assertEquals("CM", result);
	}
	
	@Test
	public void TestConverterOneThousand(){
		String result = converter.ConverterToRomanNumber("1000");
		assertEquals("M", result);
	}
	
	@Test
	public void TestConverterTwoThousand(){
		String result = converter.ConverterToRomanNumber("2000");
		assertEquals("MM", result);
	}
	
	@Test
	public void TestConverterThreeThousand(){
		String result = converter.ConverterToRomanNumber("3541");
		assertEquals("MMMDXLI", result);
	}
	
	@Test
	public void TestConverterFiveThousand(){
		String result = converter.ConverterToRomanNumber("5213");
		assertEquals("MMMMMCCXIII", result);
	}
	
	@Test
	public void TestEmpty(){
		String result = converter.ConverterToRomanNumber("");
		assertEquals("error", result);
	}
	
	@Test
	public void TestOutIndex(){
		String result = converter.ConverterToRomanNumber("549000");
		assertEquals("error", result);
	}
	
	@Test
	public void TestLetters(){
		String result = converter.ConverterToRomanNumber("asds");
		assertEquals("error", result);
	}
}
