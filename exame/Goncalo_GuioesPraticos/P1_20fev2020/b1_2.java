import java.util.Scanner;
import java.util.Stack;

public class b1_2{

    public static void main(String[] args){
    
        String opread;
        char op;

        Stack<Double> st = new Stack<Double>();

        Scanner sc1 = new Scanner(System.in);

        System.out.println("Write your opeartions, giving always the operands before the operators!");

        while (sc1.hasNextLine()) {
            Scanner sc2 = new Scanner(sc1.nextLine());

            while(sc2.hasNext()){
                System.out.println("\t"+st);
                if(sc2.hasNextDouble()){
                    st.push(sc2.nextDouble());
                }else if(st.size()<2){
                    System.err.printf("ERROR! You can only use an operator when already given two operands (you have only given %d).\n", st.size());
                    System.exit(0);
                }else{
                    opread = sc2.next().trim();
                    if(opread.length()!=1 || "+ - * /".indexOf(opread)<0){
                        System.err.printf("ERROR: \"%s\" is an invalid operator! The supported are: + - * /\n", opread);
                        System.exit(0);
                    }
                    op=opread.charAt(0);

                    switch(op){
                        case '+':
                            st.push(st.pop() + st.pop());
                            break;
                        case '-':
                            st.push(-1.0 * (st.pop() - st.pop()));
                            break;
                        case '/':
                            st.push(1.0/st.pop() * st.pop());
                            break;
                        case '*':
                            st.push(st.pop() * st.pop());
                            break;
                    }

                    System.out.println("\t"+op+" "+st);
                }
            }
            sc2.close();

            if(st.size()==1){
                System.out.printf("The result is %f\n", st.get(0));
            }
        }
        sc1.close();
    }
}