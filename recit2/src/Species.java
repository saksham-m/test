public class Species {	

//Put the instance variable here.
	
	public String species_name;
	public int population;
	public double growth_rate;

//Create a Species constructor that takes in a String for its name, an int for
//its population, and a double for its growth rate (this will represent
// percent).
	

	public Species(String name, int pop, double growth){
		
		species_name = name;
		
		if(pop>=1 && pop<=1500)
		    population = pop;
		else if(pop<1)
			population = 1;
		else if(pop>1500)
			population =1500;
		if (growth>=1 && growth<=20)
			growth_rate = growth;
		else if (growth<1)
			growth_rate = 1;
		else if (growth>20)
			growth_rate = 20;
	
		else growth_rate = 1;
		
	}

    //mergeSpecies adds the populations of the two species, changes the name
    //of the species to the concatenation of the two names, and the growth
    //rate to the maximum of the two growth rates
	public void mergeSpecies(Species other){
		//System.out.println("mergeSpecies NOT IMPLEMENTED YET");
		species_name = species_name + other.species_name;
		population = population + other.population;
		if (growth_rate<other.growth_rate)
			growth_rate = other.growth_rate;
	}

	public String toString(){
		System.out.println("Name:"+ species_name + " \n Population: "+population +"\nGrowth Rate: "+growth_rate);
		return "";
	}


    //increases the population according to the growth rate of the species, i.e.
    // updates the population instance variable
    public void grow() {
       population = population + (int)(growth_rate*population)/100;
    }

    //returns the population of the species in x years according to its growth rate
	public int populationInXYears(int x){
	     int res,i;
	     
	     res = population;
	     for(i=0;i<x;i++){
	    	 res = res + (int)(growth_rate*res)/100;
	     }
	     
                return res;
	}

}
