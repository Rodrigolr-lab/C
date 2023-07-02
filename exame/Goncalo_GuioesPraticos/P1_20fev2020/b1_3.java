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
        for(int i=0; i<input.length; i++){
            if(numbers.containsKey(input[i])){
                System.out.printf("%s ", numbers.get(input[i]));
            }else{
                System.out.printf("%s ", input[i]);
            }
        }   
        sc.close();

        System.out.println();
    }
}