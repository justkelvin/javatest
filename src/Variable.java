public class Variable {
    public static void main(String[] args) throws Exception {
        // Variables
        double pi = 3.14;
        int radius = 5;
        System.out.println(2 * radius * pi);

        // Strings
        String myName = "Kelvin";
        String surName = "Muinde";
        String fullName = myName + " " + surName;
        System.out.println(myName);
        System.out.println(surName);
        System.out.println(fullName);

        // booleans
        boolean male = true;
        male = false;
        System.out.println(male);

        // final keyword
        final int x = 10;
        System.out.println("My int: " + x);
        // x = 20; cannot be changed
        System.out.println("My int is constant: " + x);
    }
}
