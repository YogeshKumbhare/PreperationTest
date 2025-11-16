package linkedlist;

public class Singlelton {
    private static volatile Singlelton singleton;

   private  Singlelton(){
       System.out.println("private constructor");
   }

   public  static Singlelton getInstance(Singlelton singleton){
       if(singleton == null) {
           synchronized (Singlelton.class) {
               if (singleton == null) {
                   singleton = new Singlelton();
                   System.out.println("object created "+singleton);

               }

           }

       }
       return singleton;
   }

    public static void main(String[] args) {
       Singlelton singlelton = new Singlelton();
        Singlelton singlelton1 = Singlelton.getInstance(singlelton);

    }
}
