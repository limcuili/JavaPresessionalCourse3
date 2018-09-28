class MultiplicationTable {

    // task: print multiplication tables for the numbers 1 to 10 inclusive.
    public static void main (String[] args) {
        int factor1 = 1;
        while (factor1 <= 10) {
            int factor2 = 1;
            while (factor2 <= 10) {
                System.out.print( (factor1*factor2) + " ");
                factor2++;
            }
            System.out.println();
            factor1++;
        }
    }

}