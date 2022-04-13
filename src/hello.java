interface console{
    void salDetails();
    void perDetails();
}

abstract class he implements console{

    @Override
    public void perDetails() {
        Object d;
        System.out.println("p");
    }
}


public class hello extends he{
    public static void main(String[] args) {
        String s1 = null;
        String s2 = null;
        try {
            System.out.println(s1.equals(s2));
        }catch (NullPointerException npe){
            if (s1 == null) {
                System.out.println("f");
            }
        }
    }

    @Override
    public void salDetails() {

    }
}
