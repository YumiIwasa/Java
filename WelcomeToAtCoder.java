import java.util.Scanner;
public class WelcomeToAtCoder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sA = scan.next();  
        int A = Integer.parseInt(sA);
        if(1 <= A || A <= 1000){
            System.out.println(A);
        }

        String sB = scan.next();
        String sC = scan.next();
        int B = Integer.parseInt(sB);
        int C = Integer.parseInt(sC);
        if((1 <= B || B <= 1000) && (1 <= C || C <= 1000)){
            System.out.println(B + " " + C);
        }
        String sS = scan.next();
        int hogeo = sS.length();
        if(1 <= hogeo || hogeo <= 100){
            System.out.println(sS);
        }
        
        System.out.println(A + B + C + " " + sS);
    }
}