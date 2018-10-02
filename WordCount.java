/*
HOMEWORK to be handed in via moodle by Thu 4 Oct to Dr Konrad Swanepoel
name: Cui-Li LIM
student number: 201813956
*/

class WordCount {

    // task: counts the number of words of a text that is taken in as a user input.
    // a word is defined to not contain whitespaces, and have whitespace(s) preceding and following it.

    public static void main (String[] args) {
        if (args.length < 1) {
            return;
        }
        String text = args[0];
        int wordCount = 0;
        for (int charPlace = 0; charPlace < text.length(); charPlace++) {
            if (Character.isWhitespace( text.charAt(charPlace) )) {
                wordCount++;
            }
        }
        System.out.println("word count = " + (wordCount += 1));
    }

}

/*
The above is a simple word count that has to follow english grammar conventions because it counts spaces.
eg. java WordCount "Hello" >> word count = 1
eg. java WordCount "Hello person" >> word count = 2
eg. java WordCount "Hello " >> word count = 2
*/
