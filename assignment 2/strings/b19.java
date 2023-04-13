public class b19 {
    public static void main(String[] args) {
        CharSequence cs = "topsint.com";
    String s1 = "topsint.com";
    String s2 = "Topsint.com";

    System.out.println("Comparing "+s1+" and "+cs+": " + s1.contentEquals(cs));
    System.out.println("Comparing "+s2+" and "+cs+": " + s2.contentEquals(cs));

    //System.out.println("Hello everyone");
    }
    
}
