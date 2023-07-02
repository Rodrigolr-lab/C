import java.util.Scanner;

public class b1_1{

    public static void main(String[] args){

        String opread;
        char op;
        Double n1, n2, result;

        Scanner sc = new Scanner(System.in);

        System.out.print("What is your operation (number op number)? ");

        //Get first number
        if(!sc.hasNextDouble()){
            System.err.println("ERROR: First input must be a number! (decimals must be writen with commas, not points)");
            System.exit(0);
        }
        n1 = sc.nextDouble();

        //Get operation
        opread = sc.next().trim();
        if(opread.length()!=1 || "+ - * /".indexOf(opread)<0){
            System.err.println("ERROR: \""+opread+"\" is an invalid operator! The supported are: + - * /");
            System.exit(0);
        }
        op=opread.charAt(0);

        //Get second number
        if(!sc.hasNextDouble()){
            System.err.println("ERROR: Second input must be a number! (decimals must be writen with commas, not points)");
            System.exit(0);
        }
        n2 = sc.nextDouble();
        sc.close();

        //Compute the result
        result=0.0;
        switch(op){
            case '+':
                result = n1+n2;
                break;
            case '-':
                result = n1-n2;
                break;
            case '/':
                result = n1/n2;
                break;
            case '*':
                result = n1*n2;
                break;
        }


        System.out.println(n1+" "+op+" "+n2+" = "+result);

    }
}