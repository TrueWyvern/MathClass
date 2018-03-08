/*
 * Aisik Pilote
 * MathClass
 * demonstrate math methods
 */

package u2_a3_mathclass;
/**
 *
 * @author aipil3692
 */
public class U2_A3_MathClass {

    
    /**
     * @param args the command line arguments
     */
         public static void main(String[] args) {
            //lengths of given sides
            double a=14.5;
            double b=7.2;
            //unknown
            double C,c;
            //squaring known sides
            double A = (double) Math.pow(a,2);
            double B = (double) Math.pow(b,2);
            //adding sides together
            double AB = A+B;
            //finding square root and c
            c = Math.sqrt(AB);
            //rounding
            C =  Math.round(c);
            //C = Math.round(c);
            System.out.println(C);
        
       }
    
}
