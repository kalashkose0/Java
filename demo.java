public class demo {
    public static void main(String[] args) {
        int n = 4; // Example with 4 strings

        String[] strings = new String[n];
        strings[0] = "apple";
        strings[1] = "banana";
        strings[2] = "pineapple";
        strings[3] = "grape";

        String largestString = strings[0];

        for (int i = 1; i < strings.length; i++) {
            if (strings[i].length() > largestString.length()) {
                largestString = strings[i];
            }
        }

        System.out.println("The largest string is: " + largestString);

    }
}
