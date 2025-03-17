public class String_largest_lexicographically {
    public static void main(String[] args) {

        String fruits[] = {"apple","mango","banana"};
        String largest =fruits[0];

        for (int i = 1; i < fruits.length; i++) {
            // Compare lexicographically
            if (fruits[i].compareTo(largest) > 0) {
                largest = fruits[i];
            }
        }

        System.out.println("Largest string (lexicographically): " + largest);

    }
}
// In lexicographic (dictionary) order
// "apple" < "banana" < "mango", so "mango" is the largest.