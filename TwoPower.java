class TwoPower {

    // task: expect one positive integer argument m and prints the largest power of 2 which is <= m
    public static void main (String[] args) {
        if (args.length < 1) {
            return;
        }
        int m = Integer.parseInt(args[0]);
        int power = 1;
        while (Math.pow(2, power) < m) {
            power++;
        }
        if (Math.pow(2,power) == m) {
            System.out.println((int) (Math.pow(2, power)));
        } else {
            System.out.println((int) (Math.pow(2, power - 1)));
        }
    }
}