import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input: ");
        String input = sc.next();

        StringBuilder sb = new StringBuilder(input);
        sb.reverse();
        String rev = sb.toString();
        //System.out.println(rev);

        String incr = " ";

        for(int i=0; i<rev.length(); i++) {
            if (rev.charAt(i) == 'Z') {
                incr += (char)('A');
            }
            else {
                incr += (char)(rev.charAt(i)+1);
            }


        }
        System.out.print ("Output : " + incr );

    }

}
