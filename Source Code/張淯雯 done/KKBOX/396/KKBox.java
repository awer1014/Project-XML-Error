class KKBox{
    static double length,width,height;
    static double volume,surfaceArea;
a1(double y){
    volume=y;
         y=(length * width * height);
         System.out.println("��n:"+y);
    }
a2(double x){
    surfaceArea=x;
    x=(2 *(length*width + width* height + height * length));
    System.out.println("���n:"+x);
    }
    public static void main(String[] args){
    System.out.println("�п�J��: ");
    length=Integer.parseInt(args[0]); 
    System.out.println("�п�J�e: ");
    width=Integer.parseInt(args[1]);
    System.out.println("�п�J��: ");
    height=Integer.parseInt(args[2]);
    
    a1;
    a2;
}
}