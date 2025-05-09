class Rectangle{
    private int length,width;

    public void setvalue(int l,int w){
        this.length=l;
        this.width=w;
    }
    public int getarea(){
        return length*width;
    }
    public int getParameter(){
        return (2*(length+width));
    }
}

class RectangleEncap{
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.setvalue(3, 4);
        System.out.println(r.getarea());
        System.out.println(r.getParameter());
    }
}