public class Main {
    public static void main(String[] args) {
        String newName3; //i know its a garbage assigning
        // Examples
        String name = "John Doe";

        // Adding a third name to the string name.
        String newName = name.concat(" Elegant");
        System.out.println(newName);

        //Adding a letter to the end of name.
        String newName1 = name.concat(" X");
        System.out.println(newName1);

        newName = newName + " Y";
        System.out.println(newName);

        //Adding using indexes
        String newName2 = name.substring(0, 5) + "X " + name.substring(5);
        System.out.println(newName2);

        //Or using StringBuilder
        StringBuilder stringBuilder = new StringBuilder(name);
        stringBuilder.insert(5, "Elegant ");
        newName3 = stringBuilder.toString();
        System.out.println(newName3);

        int number = newName.length();
        System.out.println(number);
    }
}