import java.util.Map;
import java.util.HashMap;

import java.io.File;
import java.util.Scanner;

public class b1_3{

    public static void main(String[] args){

        int key;
        String value;

        Map<String, Integer> numbers = new HashMap<String, Integer>();

        //File processing
        try {
            File f1 = new File("bloco1/numbers.txt");
            Scanner sc1 = new Scanner(f1);

            while(sc1.hasNextLine()){

                Scanner sc2 = new Scanner(sc1.nextLine());
    
                key = -1;
                value = null;
    
                while(sc2.hasNext()){
                    
                    if(sc2.hasNextInt()){
                        key = sc2.nextInt();
                    }else{
                        value = sc2.next();
                        if(value.indexOf('-')>=0){
                            value=null;
                        }
                    }
    
                    if(key!=-1 && value!=null){
                        numbers.put(value, key);
                        value = null;
                        key = -1;
                    }
                }

                sc2.close();
            }
            
            sc1.close();

        } catch(Exception e) {
            System.err.println(e);
            System.exit(0);
        }

        System.out.println("Write me some numbers...");
        System.out.println(numbers);

        //User input processing
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" |-");
        int result = 0;
        int temp = 0;
        for(int i=0; i<input.length; i++){
            if(numbers.containsKey(input[i])){
                if (String.valueOf(numbers.get(input[i])).length() == 1 || String.valueOf(numbers.get(input[i])).length() == 2) { //If number has one or two numerals, then it's the beggining of a new number
                    if (temp!=0)
                        result += temp;
                    temp = numbers.get(input[i]);
                } else { //Otherwise, keep computing the temp number
                    if (temp!=0)
                        temp *= numbers.get(input[i]);
                    else 
                        temp = numbers.get(input[i]);
                }
            }else if (input[i].equalsIgnoreCase("and")){
                result += temp;
                temp = 0;
            } else {
                System.err.printf("'%s' does not exist on the table!\n", input[i]);
                System.exit(0);
            }
            //System.out.printf(">%d %d\n", temp, result);
        }
        sc.close();
        result += temp;

        System.out.println();
        System.out.println(result);
    }
}