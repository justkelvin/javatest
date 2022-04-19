import java.util.ArrayList;

public class Arrays {
    public static void main(String[] args) {
        // Fixed size array of 3
        String[] myStringArray = new String[3];
        myStringArray[0] = "Useraname";
        myStringArray[1] = "Password";
        myStringArray[2] = "Email";

        System.out.println(myStringArray[2]);

        int[] myNumArray = {1,2,3,4,5,6,7};

        System.out.println(myNumArray[4]);

        // Array lists
        ArrayList<String> myMusicians = new ArrayList<>();
        myMusicians.add("Sia");
        myMusicians.add("Kina");
        myMusicians.add("Meg");
        myMusicians.add(1, "Avicii");
        System.out.println(myMusicians.get(0));
        System.out.println(myMusicians.get(1));
        System.out.println(myMusicians.get(2));
        System.out.println(myMusicians.get(3));
        
        
    }
    
}
