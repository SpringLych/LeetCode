import java.util.HashMap;

/**
 * @author LiYingChun
 * @date 2018/1/25
 */
public class Test {


    public static void main(String[] args){
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(45,45);
        //int result = map.get(47);
        boolean isEsist = map.containsKey(47);
        System.out.println("result = " + isEsist);

    }
}
