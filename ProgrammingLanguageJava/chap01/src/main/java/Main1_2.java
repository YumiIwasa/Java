public class Main1_2 {
    public static void main(String[] args) {
        int lo = 1;
        int hi = 1;
        int count = 1;
        System.out.println(lo);
        while (hi < 50) {
            System.out.println(count + ":" + hi);
            hi = lo + hi;
            lo = hi - lo;
            count++;
        }
    }
}
