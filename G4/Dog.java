class Dog{
	int size;
	String name;
	
	void bark(int numOfBarks){
	    while(numOfBarks > 0){
		    if(size > 60){
		        System.out.println("Гав Гав!");
		    } else if(size > 14){
			    System.out.println("Вуф Вуф!");
		    } else {
		        System.out.println("Тяф Тяф!");
		    }
			numOfBarks = numOfBarks - 1;
		}
	}
}