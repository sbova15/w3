
public class w3_methods {

	public static void main(String[] args) {
		
		String firstName = "Sam";
		String lastName = "Bova";
		String fullName = createFullName(firstName, lastName);
		double[] num = {12, 35, 47, 29, 15};
		int[] numList = {83, 62, 45, 38};
		double[] num1 = {37, 47, 24, 34};
		double[] num2 = {24, 12, 1, 1,};
		boolean isHotOutside = true;
		double moneyInPocket = 11.50;
		int base = 3;
		int power = 4;
		
		
		System.out.println(fullName);

		String word = "Hello";
		int n = 3;
		
		System.out.println(longWord(word,n));
		
		
		System.out.println(numSum(num));
		
		System.out.println(arraySum(numList));
		
		System.out.println(arrayComp(num1, num2));
		
		System.out.println(willBuyDrink(isHotOutside, moneyInPocket));
		
		System.out.println(raisePower(base, power));

	}
	
	
	
	//Question 7
	//---------------------
	
	public static String longWord (String word, int n) {
		
		String wordWord = "";
		for(int i = 0; i < n; i++) {
			
		wordWord += word;
		
		}
		return wordWord;
	}
	
	//Question 8
		//---------------------------------
		
		public static String createFullName (String firstName, String lastName) {
		
			String fullName = firstName + " " + lastName;
			return fullName;
		}
		
	//Question 9
		
		public static String arraySum(int[] numList) {
			
			int sum = 0;
			for(int i = 0; i < numList.length; i++) {
				
				sum = sum + numList[i];
				
			}
			    if (sum > 100) {
				
				return "true";
				
			    }
			    
			    else{
			    return "";
			    }
		}
	
	//Question 10
	
	public static double numSum (double[] num){
		
		double sum = 0;
		for(int i = 0; i < num.length; i++) {
			
			sum = sum + num[i];
		}
		
		double average = sum / num.length;
		
		return average; 

		
	}
	


	// Question 11
	
	public static String arrayComp(double[] num1, double[]num2) {
		double sumNum1 = 0;
		double sumNum2 = 0;
		
		for (int i = 0; i < num1.length; i++) {
			sumNum1 = sumNum1 + num1[i];
			}
		for (int i = 0; i < num2.length; i++) {
			sumNum2 = sumNum2 + num2[i];
		}
		
		double averageNum1 = sumNum1/num1.length;
		double averageNum2 = sumNum2/num2.length;
		
		if(averageNum1 > averageNum2) {
			return "true";
		}
		
		else {
			return "";
		}
	}
	//Question 12
	
	public static String willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		
		if(isHotOutside && (moneyInPocket > 10.50)) {
			
			return "true";
		}
		else {
			return "false";
		}
	}
	
	//Question 13
	// This method takes a given int base and raises it to a given in power the returns the total
	// I created it because it is a good exercise and can be useful if writing a program than need make this calculation multiple times
	public static int raisePower(int base, int power) {
		int total = 1;
		for(int i = 0; i < power; i++) {
		
		total = total * base;
	}
		return total;
	}
}
