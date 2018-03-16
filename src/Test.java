/**
 * @author LiYingChun
 * @date 2018/1/25
 */
public class Test {

    public static void fun(){
        String a = "HelloWorld";
        int[] b = new int[256];
        char[] c = a.toCharArray();
        for (char i : c){
            int index = (int) i;
            b[i] ++;
        }
        int index = 0;
        int t;
        for (int i : b){
            System.out.print(index + " : " + i + ", ");
            index ++;
            t = index % 20;
            if (t == 0){
                System.out.println("\n");
            }
        }
    }
    public static void main(String[] args){
        fun();
    }
}
