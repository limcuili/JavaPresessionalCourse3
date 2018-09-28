class PowerOf {

    // task: takes two integer arguments a and b and outputs the powers of a, from a^1 up to a^b.
    public static void main (String[] args) {
        if (args.length < 2) {
            return;
        }
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int powered = 1;
        for (int i = 1; i <=b; i++) {
            powered = powered*a;
            System.out.println(a + "^" + i + " = " + powered);
        }
    }

}