public class Main {

    public static void main(String[] args)
    {
        //declarations
        int birthMonth = 18; //fake input simulating user input

        System.out.println("Please enter your birth month (1-12):");
        System.out.println(birthMonth);


        // if else logic
        if (birthMonth >= 1 && birthMonth <= 12)
        {
            System.out.println("Your birth month is: " + birthMonth);
        }
        else
        {
            System.out.println("You have entered an incorrect month value: " + birthMonth);
        }
    }
}
