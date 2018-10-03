/*
name: Cui-Li LIM
student number: 201813956
*/

class WordCount {

    /*
    this program counts the number of words of a text that is taken in as an argument.
    eg. java WordCount "    " >>> word count = 0
    eg. java WordCount "Hello world" >>> word count = 2
    eg. java WordCount "Hello world ?!" >>> word count = 3
    eg. java WordCount "  Hello   world  ?  " >>> word count = 3
    */

    public static void main(String[] args) {
        if (args.length < 1) {
            return;
        }
        String text = args[0];
        boolean stringIsEmpty = true;
        for (int j = 0; j < text.length(); j++) {
            if (text.charAt(j) != ' ') {
                stringIsEmpty = false;
            }
        }

        int leadingChar = 0;
        for (int i = 0; i < text.length() && text.charAt(i) == ' '; i++) {
            leadingChar++;
        }

        int wordCount = 1;
        boolean prevCharIsWhitespace = false;
        for (int i = leadingChar; i < text.length(); i++) {
            if (Character.isWhitespace(text.charAt(i))) {
                prevCharIsWhitespace = true;
            } else {
                if (prevCharIsWhitespace == true) {wordCount++;}
                prevCharIsWhitespace = false;
            }
        }

        if (stringIsEmpty) {
            System.out.println("word count = 0");
        } else {
            System.out.println("word count = " + (wordCount));
        }

    }

}