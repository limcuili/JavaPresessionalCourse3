class LeapYear {

    // task: expect one positive integer argument, which is interpreted as year, and determine whethet it is a leap year
    public static void main (String[] args) {
        if (args.length < 1) {
            return;
        }
        int year = Integer.parseInt(args[0]);
        if ( (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) ) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }

}