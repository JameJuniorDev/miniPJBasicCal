import java.util.*;
public class BasicCal {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    boolean con = true;
    double sum;
    while (con) {
        System.out.println("\t=== Basic Calculator ===");
        System.out.print("Fist Numbers : ");
        double fist = sc.nextDouble();
        System.out.print("Specify Operator( + - x / ) : ");
        String operator = sc.next();
        System.out.print("End Numbers : ");
        double end = sc.nextDouble();
        switch (operator) {
            case "+":sum=fist+end;System.out.println(fist+" "+operator+" "+end+" = "+sum);
            break;
            case "-":sum=fist-end;System.out.println(fist+" "+operator+" "+end+" = "+sum);
            break;
            case "x":sum=fist*end;System.out.println(fist+" "+operator+" "+end+" = "+sum);
            break;
            case "/":if(end==0){System.out.println("Error End Numbers = 0");break;}
            sum=fist/end;System.out.println(fist+" "+operator+" "+end+" = "+sum);
            break;
            default:System.out.println("Operator Error");break;
        }
        System.out.println("Continue or No");
        String conti = sc.next();
        switch (conti) {
            case "No":con=false;break;
            default:System.out.println("Ok Continue");break;
        }
    }
    System.out.println("\t=== *** End *** ===");
    sc.close();
}
    
}
