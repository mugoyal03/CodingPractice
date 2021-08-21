import java.util.*;

public class AltiMx {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,5,2,7,8,1,8,9,12,2);
        // Ans: 2
        Map<Integer, Integer> map = new HashMap<>();


        list.stream().forEach((a)->{
            if(map.containsKey(a)){
                int x = map.get(a);
                x=x+1;
                map.put(a,x);
            }else{
                map.put(a,1);
            }
        });
        System.out.println(map.entrySet().stream().max(new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {

                if(o1.getValue()>o2.getValue()){
                    return -1;
                }
                else if(o1.getValue()<o2.getValue()){
                    return 1;
                }
                return 0;
            }
        }));


    }

}
