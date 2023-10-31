public class MadLib {

    public static void main(String[] args) { // main method
        System.out.println("hello world");
        MadLib myStory = new MadLib();
    }

    public MadLib(){ // constructor method
        System.out.println("halo varld");

        String classmate = "Ava";
        System.out.println(classmate);

        String city = "Boston";
        System.out.println(city);

        String noun = "School";
        System.out.println(noun);

        String adjective = "Funny";
        System.out.println(adjective);

        String pluralNoun = "Children";
        System.out.println(pluralNoun);

        String pluralAnimal = "Mustangs";
        System.out.println(pluralAnimal);

        String trueOrFalse = "True";
        System.out.println(trueOrFalse);

        float decimalBiggerThan1 = 23.7f;
        System.out.println(decimalBiggerThan1);

        int number1 = 15;
        System.out.println(number1);

        int number2 = 34;
        System.out.println(number2);

        int wholeNumberBetween1And4 = 2;
        System.out.println(wholeNumberBetween1And4);

        String miltonTeacher = "Dr. Funes";
        System.out.println(miltonTeacher);

        String miltonDean = "Mr Ruiz";
        System.out.println(miltonDean);

        String letterGrade = "A";
        System.out.println(letterGrade);

        String season = "Fall";
        System.out.println(season);

        //define a string called story for mad lib
        String story = "This weekend I am going camping with "
                +classmate+ ". We are going to a campsite in "
                +city+ ". I packed my "+noun+ " and "
                +pluralNoun + ".  The forecast is calling for a high of "
                +decimalBiggerThan1+ " degrees fahrenheit. So it should be a "
                +adjective+" day! This year, the park rangers have seen "
                +number1+ " " +pluralAnimal + " which seems kind of dangerous. "
                +miltonTeacher+" said it's " + trueOrFalse + " that "+pluralAnimal+ " eat class "
                +wholeNumberBetween1And4+ " students in the " +season+ ". But, "
                +miltonDean+ " said it actually has only happened "
                + number2+" times. Wish us luck! If we survive, we will earn a "
                +letterGrade+ "- in P.E. class.";

//now print story to the dos window
        System.out.println(story);


    }

}
