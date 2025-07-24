public class GCD {
    int gcd(int m, int n) {
        while (n % m != 0) {
            int r = n % m;
            n = m;
            m = r;
        }
        return m;
    }
    public static void main(String[] args) {
        GCD obj = new GCD();
        int result = obj.gcd(12, 18);
        System.out.println("GCD is: " + result);
    }
}

