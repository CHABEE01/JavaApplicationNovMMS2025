public class DataType{
    public static void main(String[] args){
		//integer Type
	    byte age =25;
		System.out.printf("you are %d years old%n",age);
		
		short Quantity = 30000;
		System.out.printf("I bought %,d Quantity of phones%n",Quantity);
		
		int population = 292527826;
		System.out.printf("The population in Nigeria is %,d%n",population);
		
		long worldPopulation = 5636637727272272765l;
		System.out.printf("The world's population is %,d%n",worldPopulation);
		
		//float-point
		float myBalance = 67060742.8672F;
		System.out.printf("My account balance is $%,.2f%n",myBalance);
		
		double cbnBalance = 5456737383838477383883.763763664674348483764;
		System.out.printf("The CBN balance is $%,.2f%n",cbnBalance);
		
		char symbol = '@';
		System.out.printf("Your email address is snehsnehsneh%cgmail.com%n",symbol);
		
		boolean isJava = true;
		System.out.printf("Do you love learning Java? %b%n",isJava);

		
	}
}