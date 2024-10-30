package day18;

public class CountCharacterOccurence {

	public static void main(String[] args)
    {
        String s = "Java is java again java again";

        char c = 'j';

        int count = s.length() - s.replace("j", "").length();

        System.out.println("Number of occurances of 'j' is: "+count);
    }
}