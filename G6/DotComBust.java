import java.util.*;

public class DotComBust{
	private GameHelper helper = new GameHelper();
	private ArrayList<DotCom> dotComList = new ArrayList<DotCom>();
	private int numOfGuesses = 0;
	
	private void setUpGame(){
	    //Создадим несколько сайтов и присвоим им адреса
		DotCom one = new DotCom();
		one.setName("Pets.com");
		DotCom two = new DotCom();
		two.setName("eToys.com");
		DotCom three = new DotCom();
		three.setName("Go2.com");
		dotComList.add(one);
		dotComList.add(two);
		dotComList.add(three);
		
		System.out.println("Ваша цель - потопить три сайта.");
		System.out.println("Pets.com, eToys.com, Go2.com");
	    System.out.println("Попытайтесь потопить их за минимальное количество ходов");
		
		for (DotCom dotComToSet : dotComList){
		    ArrayList<String> newLocation = helper.placeDotCom(3);
			dotComToSet.setLocationCells(newLocation);
		} // конец цикла 
	} // конец метода setUpGame
    
	private void startPlaying(){
	    while(!dotComList.isEmpty()){
		    String userGuess = helper.getUserInput("Сделайте ход");
			checkUserGuess(userGuess);
		} //конец while
		finishGame();
	} // конец метода startPlaying method
	
	private void checkUserGuess(String userGuess){
	    numOfGuesses++;
		String result = "Мимо";
		for(DotCom dotComTest : dotComList){
		    result = dotComTest.checkYourself(userGuess);
			if(result.equals("Попал")){
			    break;
			}
			if(result.equals("Потопил")){
				dotComList.remove(dotComTest);
			    break;
			}
		} // конец for
		
		System.out.println(result);
	} // конец метода
	
	private void finishGame(){
	    System.out.println("Все сайты ушли ко дну, теперь ваши акции ничего не стоят!");
		if(numOfGuesses <= 18){
		    System.out.println("Это заняло у Вас всего " + numOfGuesses + "попыток.");
		    System.out.println("Вы успели выбраться до того, как ваши вложения утонули.");
		} else {
		    System.out.println("Это заняло у вас довольно много времени. " + numOfGuesses + " попыток.");
		    System.out.println("Рыбы хороводы водят вокруг ваших вложений.");
		}
	} //конец метода
	
	public static void main (String[] args){
	    DotComBust game = new DotComBust();
		game.setUpGame();
		game.startPlaying();
	} // конец метода
}