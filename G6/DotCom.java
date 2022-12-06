import java.util.*;

public class DotCom{
    private ArrayList<String> locationCells;
    //int numOfHits = 0;
	private String name;
    
    public void setLocationCells(ArrayList<String> loc){
        locationCells = loc;
    }
	
	public void setName(String n){
	    name = n;
	}
		
	
    public String checkYourself(String userInput){
        //int guess = Integer.parseInt(stringGuess);
        String result = "Мимо";
        int index = locationCells.indexOf(userInput);
		if(index >= 0){
			locationCells.remove(index);
			if(locationCells.isEmpty()){
                result = "Потопил";
			} else {
			    result = "Попал";
			}
        }
        System.out.println(result);
        return result;
    }
}