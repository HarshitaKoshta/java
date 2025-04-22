

public class matchStr{
    public static void main(String[] args) {
        String s1 = "vanshika";
        String s2 = "harshita";
        int count = 0;

        for (int i = 0; i < s1.length(); i++) {
            for(int j= 0;j<s2.length();j++){
                if(s1.charAt(i)==s2.charAt(j)){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}