public class CircleOfLife {

	public static void main(String args[]){
		//Create a new Species object here, passing in the appropriate arguments
		Species dino = new Species("Dino",100,15);
		
		//print out the species' growth rate

		

		//use the species' toString here
		
		System.out.println(dino);
		
		//call populationInXYears here
		

		System.out.println(dino.populationInXYears(2));
		//Create a new Species object here, passing in the appropriate arguments using a very large number for the population (e.g. 100000000)

		Species virus = new Species("Virus",1700,10);
		
		//print out the species' population to make sure it is set to 1500
		System.out.println(virus);
				
		//call populationInXYears here, feel free to hardcode in the int to be passed to the method

		//call mergeSpecies here
                //test that mergeSpecies is doing what you expected it to
		virus.mergeSpecies(dino);
		
		System.out.println(virus);
				
	}
}
