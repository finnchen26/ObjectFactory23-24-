public class Houses {
    public int numOfWindows;
    public String color;
    public String owner;
    public boolean hasLawn;

    public Houses(int pNumOfWindows, String pColor, String pOwner, boolean pHasLawn){
        System.out.println("Made a new house!");
        numOfWindows = pNumOfWindows;
        color = pColor;
        owner = pOwner;
        hasLawn = pHasLawn;

        describeHouses();

        if (color.equals("blue")){
            System.out.println("Boring House!");
        } else{
            System.out.println("Nice House!");
        }

    }

    public Houses() {
        System.out.println("Made a new house!");
        numOfWindows = 30;
        color = "blue";
        owner = "Finn";
        hasLawn = true;

        describeHouses();

        if (numOfWindows < 10){
            System.out.println("Small House!");
        } else{
            System.out.println("Big House!");
        }

    }



    public void describeHouses(){
        System.out.println("This is a house that is " + color + ", and it is owned by " + owner + ". It has " + numOfWindows + " number of windows, and it is " + hasLawn + " that it has a lawn.");
    }
}
