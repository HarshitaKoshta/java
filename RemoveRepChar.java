public class RemoveRepChar{
    public static void main(String[] args) {
        String str = "hhllo";
        char[] chArr = str.toCharArray();

        for (int i = 0; i <chArr.length; i++) {
            boolean duplicate = false;
            for (int j = 0; j < i; j++) {
             if(chArr[i]==chArr[j])   {
                duplicate=true;
                break;
             }
            }
            if(!duplicate){
            System.out.println(chArr[i]);
        }
    }
}
}
/*
string newStrr = "";
for(int i =0;i<str.length();i++){
  char c = str.charAt(i);
  if(newStr.indexOf(c)==-1){
  newStr+=c;
  }
}*/