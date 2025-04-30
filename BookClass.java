// Create a class Book with title, author, and price. Add a method to apply a discount of 10% and
 //display the final price
class book{
   String title;
   String authorName;
   double price;
   void discount(){
      price = price - (price*0.10);
      System.out.println("price after discount:"+price);
   }
   void display(){
      System.out.println(title);
      System.out.println(authorName);
    // System.out.println("price"+price);
   }
}

class BookClass{
   public static void main(String[] args) {
       book b =new book();
       b.title = "story of life";
       b.authorName = "Vanshika";
       b.price = 500;
       b.discount();
       b.display();
   }
}