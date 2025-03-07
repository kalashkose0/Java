public class String_AlphabetPattern {
    public static void main(String[] args){

//                a
//                ab
//                abc
//                abcd
//                abcde

        for (int i = 1; i <= 26; i++) {
            // print characters from 'a' to the i th letter
            for (char ch = 'a'; ch < 'a' + i; ch++) {
                System.out.print(ch+" ");
            }
            System.out.println(); // next line
        }

    }
}
