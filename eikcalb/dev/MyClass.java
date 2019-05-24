package JavaProject1.eikcalb.dev.MyClass;
        
import java.util.HashMap;

public class MyClass {

    public static void main(String[] args) {
        if (args.length < 1) {
            System.err.println("You must provide user input.");
            System.exit(1);
        }
        String userInput = args[0];
        HashMap hold = new HashMap<String, Integer>(userInput.length());
        for (int i = 0; i < userInput.length(); i++) {
            char c = userInput.charAt(i);
            if (hold.containsKey(c)) {
                hold.put(c, ((int) hold.get(c) + 1));
            } else {
                hold.put(c, 1);
            }
        }
        for (Object key:hold.keySet()) {
            if((int)hold.get(key) > 1){
                System.out.println(key+"="+hold.get(key));
            }
        }
    }
}
