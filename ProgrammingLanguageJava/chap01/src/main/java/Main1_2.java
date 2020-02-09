public class Main1_2 {
    static final String JYOUSU = "乗数";
    static final String HEIHOUSU = "平方数";
    public static void main(String[] args) {
        int lo = 1;
        int hi = 1;
        int count = 1;
        System.out.println(JYOUSU + ": " + HEIHOUSU);
        while (hi < 50) {
            System.out.println(count + ":" + hi);
            hi = lo + hi;
            lo = hi - lo;
            count++;
        }
    }
}
