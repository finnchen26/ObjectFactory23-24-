public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Ponies p;
        p = new Ponies("bobby", "pink", 20.56, true, false);
        System.out.println("pony p's name is " + p.name);
        p.describePony();

        Ponies a;
        a = new Ponies("teddy", "pink", 20.56, false, false);
        System.out.println("pony a's name is " + a.name);
        a.describePony();

        Ponies q;
        q = new Ponies("qal", "green", 21.34, false, true);
        System.out.println("pony q's name is " + q.name);
        q.describePony();

    }
}