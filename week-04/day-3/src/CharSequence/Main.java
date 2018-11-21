package CharSequence;

public class Main {

  public static void main(String[] args) {

    Gnirts gnirts = new Gnirts("name");
    Gnirts gnirts2 = new Gnirts("name2");

    Gnirts g = new Gnirts("example");
    System.out.println(g.charAt(1));
    System.out.println(g.subSequence(1,3));
// should print out: l

    System.out.println(gnirts.equals(gnirts2));

    Shifter s = new Shifter("example", 2);
    System.out.println(s.charAt(0));
// should print out: a

  }

}
