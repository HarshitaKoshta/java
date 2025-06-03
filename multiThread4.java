class download extends Thread{
    String fileName;

    public download(String fileName) {
        this.fileName=fileName;
    }
    
    public void run(){
        for(int i=1;i<=5;i++){
        System.out.println(fileName+ "downloading.."+ " "+(i*20)+ "%");
            try {
             Thread.sleep(2000);
        } catch (Exception e) {
        }
      }
       System.out.println(fileName+"done");
    }
}

public class multiThread4 {
    public static void main(String[] args) {
        download d = new download("file A ");
        download d1 = new download("file B ");
        d.start();
        d1.start();
    }
}
