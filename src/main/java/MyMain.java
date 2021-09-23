import java.util.Arrays;

public class MyMain {

    // Reverses an array
    public static int[] reverse(int[] arr) {
        int length_counter = arr.length - 1;
        int [] arr2 = new int[arr.length];

        for (int i = 0; i < arr.length; i++){
            arr2[i] = arr[length_counter];
            length_counter -= 1;
        }
        return arr2;
    }

    // Finds the second largest number in an array
    public static int secondLargest(int[] arr) {
        int biggest = Integer.MIN_VALUE;
        int biggest2nd = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] >= biggest) {
                biggest2nd = biggest;
                biggest = arr[i];
            }
            else if (arr[i] > biggest2nd){
                biggest2nd = arr[i];
           }
        }

        return biggest2nd;
    }

    // This method is given a word, and it checks to see
    // if it was spelled correctly. The method only considers
    // words in the array dictionary as valid words
    // The method returns true is the word is spelled correctly
    // and false otherwise
    public static boolean spellCheck(String word) {
        // Don't edit this array
        // This is our dictionary of valid words
        String[] dictionary = {"the","of","and","a","to","in","is","you","that","it","he","was","for","on","are","as","with","his","they","I","at","be","this","have","from","or","one","had","by","word","but","not","what","all","were","we","when","your","can","said","there","use","an","each","which","she","do","how","their","if","will","up","other","about","out","many","then","them","these","so","some","her","would","make","like","him","into","time","has","look","two","more","write","go","see","number","no","way","could","people","my","than","first","water","been","call","who","oil","its","now","find","long","down","day","did","get","come","made","may","cat","dog","cats","dogs"};

        int i = 0;
        while (i < dictionary.length){ // the loop is not being used for some reason -- skipping right to false
            // System.out.println(dictionary.length);
            if (word.equals(dictionary[i])) {
                return true;
            }
            else {
                // System.out.println(i);
                i++;
            }
            // return false;

        }
        return false;
    }


    public static void main(String[] args) {
        int [] arr = {1,2,3,4,6,5,7,8};
        // String word = "Penguin";
        String word = "you";
        System.out.println(Arrays.toString(reverse(arr)));
        System.out.println(secondLargest(arr));
        System.out.println(spellCheck(word));

    }
}
