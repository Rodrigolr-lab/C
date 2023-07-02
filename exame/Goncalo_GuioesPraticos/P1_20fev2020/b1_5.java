
import java.util.Map;
import java.util.HashMap;

import java.util.Scanner;

public class b1_5 {

    static Map<String, Double> vars;

    public static void main(String[] args) {


        vars = new HashMap<String, Double>();

        Scanner sc1 = new Scanner(System.in);

        // Get user input
        while (sc1.hasNextLine()) {

            Scanner sc2 = new Scanner(sc1.nextLine());
            processLine(sc2);
            sc2.close();

        }

        sc1.close();

    }

    // Process user input
    public static void processLine(Scanner sc) {

        Double n1, n2, result;
        char op = '\0';
        String opread, varname;

        n1 = n2 = null;

        if (sc.hasNextDouble()) { // If first word is a number
            
            result = processExpression(sc, vars);

            System.out.printf("\tresult = %f\n", result);

        } else { // If first word is a string

            varname = sc.next();

            if (varname.charAt(0) >= 'A' & varname.charAt(0) <= 'Z' || varname.charAt(0) >= 'a' & varname.charAt(0) <= 'z' || varname.charAt(0) == '_') { // If variable with valid name
                if (!sc.hasNext()) { // If EOF
                    System.out.printf("\tresult = %f\n", getVarValue(vars, varname));
                } else { // Else, the only valid chars are operations and equal
                    opread = sc.next();
                    op=opread.charAt(0);

                    if (opread.length() != 1 || "+ - * / =".indexOf(opread) < 0) { //Validate
                        System.err.printf("ERROR! %s\n", "After a variable name the only valid inputs are EOF, = or an operator!");
                        System.exit(0);
                    }else{
                        if(op=='='){
                            result = processExpression(sc, vars);
                            vars.put(varname, result);
                        }else{
                            op = getOp(opread);

                            n1 = getVarValue(vars, varname);

                            if(sc.hasNextDouble()){
                                n2 = sc.nextDouble();
                            }else{
                                varname = sc.next();

                                if (!(varname.charAt(0) >= 'A' & varname.charAt(0) <= 'Z' || varname.charAt(0) >= 'a' & varname.charAt(0) <= 'z' || varname.charAt(0) == '_')) {
                                    System.err.printf("ERROR! %s\n", "A varible name must start with a letter or an ubderscore ('_')!");
                                    System.exit(0);
                                }

                                n2 = getVarValue(vars, varname);
                            }

                            result = computeResult(n1, op, n2);
                            System.out.printf("\tresult = %f\n", result);
                        }
                    }
                }
            } else {
                System.err.printf("ERROR! %s\n", "A varible name must start with a letter or an ubderscore ('_')!");
                System.exit(0);
            }

        }

    }

    static Double getVarValue(Map<String, Double> vars, String key) {

        if (vars.containsKey(key)) {
            return vars.get(key);
        }

        System.err.printf("ERROR! %s\n", "The variable '" + key + "' hasn't been defined yet!");
        System.exit(0);
        
        return null;
        
    }

    static char getOp(String opread){
        if (opread.length() != 1 || "+ - * /".indexOf(opread) < 0) {
            System.err.printf("ERROR! %s\n",
                    "\"" + opread + "\" is an invalid operator! The supported are: + - * /");
            System.exit(0);
        }

        return opread.charAt(0);
    }

    static Double computeResult(Double n1, char op, Double n2){
        switch (op) {
            case '+':
                return n1 + n2;
            case '-':
                return n1 - n2;
            case '/':
                return n1 / n2;
            case '*':
                return n1 * n2;
        }
        return -1.0;
    }

    static Double processExpression(Scanner sc, Map<String, Double> vars){
        Double n1, n2, result;
        char op = '\0';
        String opread, varname;
        
        n1 = n2 = result = null;

        if(sc.hasNextDouble()){
            n1 = sc.nextDouble();
        }else{
            varname = sc.next();

            if (!(varname.charAt(0) >= 'A' & varname.charAt(0) <= 'Z' || varname.charAt(0) >= 'a' & varname.charAt(0) <= 'z' || varname.charAt(0) == '_')) {
                System.err.printf("ERROR at '%s'! %s\n", varname,  "A varible name must start with a letter or an underscore ('_')!");
                System.exit(0);
            }
                
            n1 = getVarValue(vars, varname);
        }

        if (!sc.hasNext()) { // Get first number
            result = n1;
        } else {

            // Get operation
            if (sc.hasNextDouble()) {
                System.err.printf("ERROR! %s\n",
                        "After a number the only valid scenarius are an EOF or an operation! (Not a number)");
                System.exit(0);
            }
            opread = sc.next();
            op = getOp(opread);

            // Get second number

            if(sc.hasNextDouble()){
                n2 = sc.nextDouble();
            }else{
                varname = sc.next();

                if (!(varname.charAt(0) >= 'A' & varname.charAt(0) <= 'Z' || varname.charAt(0) >= 'a' & varname.charAt(0) <= 'z' || varname.charAt(0) == '_')) {
                    System.err.printf("ERROR at '%s'! %s\n", varname,  "A varible name must start with a letter or an underscore ('_')!");
                    System.exit(0);
                }
                    
                n2 = getVarValue(vars, varname);
            }

            result = computeResult(n1, op, n2);
        }

        return result;
    }

}