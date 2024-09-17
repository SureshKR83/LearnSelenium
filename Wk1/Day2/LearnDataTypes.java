package Wk1.Day2;

public class LearnDataTypes 
{

public static void main(String[] args)
{

	int inrNo = 1240;
	String currencyValue = "AED";
	float conValue = 0f;
	
	System.out.println("Conversion Value: " +inrNo);
	System.out.println("Conversion Curreny: " +currencyValue);
	
	if (currencyValue == "USD")
			conValue = (float)(inrNo * 83.75);
	else if (currencyValue == "GBP")
			conValue = (float)(inrNo * 110.08);
	else if (currencyValue == "EURO")
			conValue = (float)(inrNo * 92.96);
	else 
		System.out.println("Invalid Currency");
		
	System.out.println("Value after Conversion");
	System.out.println("Converted Currnecy Value: " +conValue);
}
	
}
