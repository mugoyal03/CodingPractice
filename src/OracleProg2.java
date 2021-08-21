public class OracleProg2 {

    public static void main(String[] args) {
        String str = "codeWithJava";

        int count = 1;

        for(char ch : str.toCharArray()){
            if(ch >= 65 && ch <=91){
                count++;
            }
        }
        System.out.println(count);

    }
}


