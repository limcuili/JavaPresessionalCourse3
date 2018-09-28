class HowAreYouAll {

    public static void main (String[] args) {
        int i = 0;
        System.out.print("Hello");
        while (i < args.length) {
            if (i != 0) {
                System.out.print(",");
            }
            System.out.print(" " + args[i]);
            i++;
        }
        System.out.println(", how are you today?");
    }

}

// Run the program with 'java HowAreYouAll A B C'