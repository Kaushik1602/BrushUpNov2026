package beginnerGuide;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    static void main(String[] args) {
        System.out.println(fizzBuzz(100));
    }

    public static List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>();
        for(int i=1;i<=n;i++){
            String output = "";
            if(i%3==0){
                output = "Fizz";
            }
            if(i%5==0){
                output += "Buzz";
            }
            if(output.isEmpty()){
                output += i;
            }
            list.add(output);
        }
        return list;
    }

}
