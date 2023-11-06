public class Ponies {
    // true/false = boolean
    // numbers = int, double
    // words = String

    public boolean isUnicorn;
    public boolean isPegasus;

    public double size;
    public String name;
    public String color;

    public Ponies(String pName, String pColor, double pSize, boolean pIsUnicorn, boolean pIsPegasus) { //constructor, no return type, has to have same name as class
        System.out.println("made a new pony!");
        isUnicorn = pIsUnicorn;
        isPegasus = pIsPegasus;
        size = pSize;
        name = pName;
        color = pColor;

        describePony();

        if(color.equals("pink")){
            System.out.println("I am PINK!");
        }
        else {
            System.out.println("I am NOT PINK!");
        }

    }

    public Ponies() { //overloading: same name for methods of constructors, but different parameters (line 22 vs line 12)
        System.out.println("made a new pony!");
        size = 22.09;
        name = "fly";
        color = "purple";
        isUnicorn = true;
        isPegasus = false;
        describePony();

        if(color.equals("pink")){
            System.out.println("I am PINK!");
        }
        else {
            System.out.println("I am NOT PINK!");
        }

    }

    public void describePony(){ //void = return type
        System.out.println("this is pony " + name + " they are the color " + color + " with a size of " + size + ". It is " + isUnicorn + " that the pony is a Unicorn. It is " + isPegasus + " that the pony is a Pegasus.");
    }

}
