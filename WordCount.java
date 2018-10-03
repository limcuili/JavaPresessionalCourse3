/*
HOMEWORK to be handed in via moodle by Thu 4 Oct to Dr Konrad Swanepoel
name: Cui-Li LIM
student number: 201813956
*/

class WordCount {

    // task: counts the number of words of a text that is taken in as a user input.
    // a word is defined to not contain whitespaces, and have whitespace(s) preceding and following it.

    public static void main(String[] args) {
        if (args.length < 1) {
            return;
        }
        String text = args[0];
        int wordCount = 0;
        boolean prevCharIsWhitespace = false;
        for (int i = 0; i < text.length(); i++) {
            if (Character.isWhitespace(text.charAt(i))) {
                prevCharIsWhitespace = true;
            } else {
                if (prevCharIsWhitespace == true) {wordCount++;}
                prevCharIsWhitespace = false;
            }
        }

        boolean allIsWhitespace = true;
        for (int j = 0; j < text.length(); j++) {
            if (text.charAt(j) != ' ') {
                allIsWhitespace = false;
            }
        }

        if (allIsWhitespace) {
            System.out.println("word count = 0");
        } else {
            System.out.println("word count = " + (wordCount + 1));
        }

    }

}

/*
eg. java WordCount "    " >> word count = 0
eg. java WordCount "Hello world" >> word count = 2
eg. java WordCount "Hello world ?" >> word count = 3
eg. java WordCount "Hello world ? " >> word count = 3
HOWEVER eg. java WordCount " Hello world ? " >> word count = 4 (note the leading space)
*/
