class rev {

    public static void main(String[] args) {
        reverse();
    }

    static void reverse() {
        int n = 123;
        int rev = 0;

        while (n > 0) {
            rev = rev * 10 + n % 10;
            n = n / 10;
        }

        System.out.println("Reverse = " + rev);
    }
}