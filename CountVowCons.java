public class CountVowCons{
    public static void main(String[] args) {
        String w = "hellooo";
        int vowel = 0 ,consonant =0;

        for (int in = 0; in < w.length(); in++) {
          char ch = w.charAt(in);
            if(ch =='a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
              vowel++;
            }else
            consonant++;
       }
       System.out.println("vowel: "+vowel);
       System.out.println("consonant: "+consonant);
    } 
}