class Reverse {
    public static void main(String[] args) {
        int n = 10; // 00001010
        int rev = 0;

        for (int i = 0; i < 32; i++) {
            rev <<= 1;
            rev |= (n & 1);
            n >>= 1;
        }

        System.out.println(rev);
    }
}
