class GuessGame{
    Player p1;
    Player p2;
    Player p3;
    
    public void startGame(){
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();
        
        int guessp1 = 0;
        int guessp2 = 0;
        int guessp3 = 0
            
        boolean p1isRight = false;
        boolean p2isRight = false;
        boolean p3isRight = false;
        
        System.out.println("Я загадываю число от 0 до 9");
        int targetNumber = (int) (Math.random() * 10);
    }
    
}