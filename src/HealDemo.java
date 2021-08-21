import java.util.*;

public class HealDemo {

    public static void main(String[] args) {

        List<Emp> list = new ArrayList<>();

        list.add(new Emp("Mukesh","M","A"));
        list.add(new Emp("Yogesh","M","B"));
        list.add(new Emp("Megha","F","C"));

        Map<String,Integer> genderMap = new HashMap<>();

        list.stream().forEach((e)->{
            if("M".equals(e.getName)){
                if(genderMap.containsKey(e.getName)){
                    genderMap.put("M", genderMap.get("M")+1);
                }
                else{
                    genderMap.put("M", 1);
                }
            }
            else {
                if(genderMap.containsKey(e.getName)){
                    genderMap.put("F", genderMap.get("F")+1);
                }
                else{
                    genderMap.put("F", 1);
                }
            }
        });
        System.out.println(genderMap);

    }


    static class Emp{
        public String name;
        public String getName;
        public String dept;

        public Emp(String name, String getName, String dept) {
            this.name = name;
            this.getName = getName;
            this.dept = dept;
        }

    }
}
