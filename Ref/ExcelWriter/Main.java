import java.util.*;
public class Main{
    public static void main(String[] args){
        Map<String, String> map = new HashMap<>();
        //加入元素，加入時如果出現相同的鍵，則新的値會覆蓋原有的鍵對應值，並put方法會返回被覆蓋的値
        map.put("01", "a");
        map.put("02", "b");
        map.put("03", "c");
        System.out.println("containKey: " + map.containsKey("02"));
        System.out.println("containValue: " + map.containsValue("b"));//true
        System.out.println("remove: " + map.remove("03"));//c
        System.out.println(map);//{01=a, 02=b}
        //可以通過get方法的返回值來判斷一個鏈是否存在，通過返回null來判斷
        System.out.println("get: " + map.get("01"));//get: a
        map.put("04", null);
       
        //獲取集合中所有的値
        Collection<String> col = map.values();
        // [null, a, b]
        System.out.println(col);
    }
}