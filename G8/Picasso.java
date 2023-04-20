interface Nose{
    public int iMethod();
}

abstract class Picasso implements Nose{
    public int iMethod(){
        return 7;
    }
}

class Clown extends Picasso{ }

class Acts extends Picasso{
    public int iMethod(){
        return 5;
    }
}
