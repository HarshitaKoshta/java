class StringCompression{
    static void compression(String str){
        StringBuilder newStr = new StringBuilder();
        int count = 1;
        for(int i =1; i<str.length();i++){ 
            if(str.charAt(i)==str.charAt(i-1)){
                   count++;
            }
            else {
                newStr.append(str.charAt(i-1)).append(count);
                count=1;
            }
        }
        newStr.append(str.charAt(str.length() - 1)).append(count);
        for(int i =0;i<newStr.length();i++){
         System.out.print(newStr.charAt(i));
        }
       
    }
    public static void main(String[] args) {
        String str = "aaabbbbbbc";
        compression(str);
    }
}