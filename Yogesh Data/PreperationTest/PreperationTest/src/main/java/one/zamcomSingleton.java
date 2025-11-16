package one;

class Super_zamcomSingleton implements  Cloneable{

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}


 class zamcomSingleton extends  Super_zamcomSingleton{

    private static zamcomSingleton singleton = null;

   private zamcomSingleton(){


    }

    public static zamcomSingleton getInstnace(){

       if(singleton == null){

           singleton = new zamcomSingleton();
       }
       return singleton;
    }


}


class Main{
    public static void main(String[] args) {

    }





}