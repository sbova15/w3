
public class w3_array {

	public static void main(String[] args) {
		
		 
		double[] age = {3, 9, 23, 64, 2, 8, 28, 93, 100};
		double average = 0;
		
		//Q1.A
	    //-------------------------------------------------------
	    
		int j = age.length - 1;
		
		double q = age[j] - age[0];
		
		System.out.println("First age minus last age equals: " + q);
		
		 //Q1.C
		//------------------------------------
		 
		for(int i = 0; i< age.length; i++) {
		
		average = average + age[i];
		
	
		}
		System.out.println("Average age is: " + average/age.length);
		
		
		
		//Q2.A
		//-------------------------------------------
		
		
		String[] names = {"Sam", "Tommy", "Tim", "Sally","Buck", "Bob"};
		
		double nameCount = 0;
		
		String namesList = "";
		
		for(int p = 0; p < names.length; p++) {
		
		String name = names[p];
		nameCount = nameCount + name.length();
		
		}
	
	    System.out.println("Average number of letters in names list is: " + nameCount / names.length);
	    
	    
	    //Q2.B
	    //---------------------------------------------
	    
		for(int i = 0; i < names.length; i++) {
			
			namesList = namesList  + names[i] + " ";
			
		}
		
		
		System.out.println(namesList);
		
		
		
		// 5 & 6. Stores name element length in nameLengths and prints the sum of the elements
		//----------------------------------------------------------------------
		
		
		int[] nameLengths = new int[6];
		int nameLengthsTotal = 0;
		
		for(int i = 0; i < nameLengths.length; i++) {
			
			String name = names[i];
			nameLengths[i] = name.length();
			nameLengthsTotal = nameLengthsTotal + nameLengths[i];
			
		}
		System.out.println("Total letters in names list is :" + nameLengthsTotal);

	}

}
