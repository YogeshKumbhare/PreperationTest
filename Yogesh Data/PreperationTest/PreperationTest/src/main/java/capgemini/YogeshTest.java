package capgemini;


public class YogeshTest {
    static <S> void genericDIpslay(S element){
        System.out.println(element.getClass().getName() + " = " + element);
    }
    public static void main(String[] args) {
genericDIpslay(11);
genericDIpslay("ABC");
genericDIpslay(1.0);
    }
}
