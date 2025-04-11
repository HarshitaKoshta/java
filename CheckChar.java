public class CheckChar{
    public static void main(String[] args) {
        char ch = 'e';
        switch (ch) {
            case 'a' :
            case 'e' :
            case 'i' :  
            case 'o' :
            case 'u' : System.out.println("vowel");
                break;
            default: System.out.println("consonant");
                
        }
    }
}