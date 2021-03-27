import java.io.*;
import java.util.*;
import java.math.*;
public class KKBOX
{
    static int length;
    static int width;
    static int height;
    
    static double volume(int length,int width,int height)
    {
        double v1=length*width*height;
        return v1;
    }
    
    static double surfaceArea(int length,int width,int height)
    {
        double s1=((length*width)+(width*height)+(height*length))*2;
        return s1;    
    }
    
    public static void main(String[] args)
    {
        Scanner cin = new Scanner(System.in);
        System.out.println("請輸入長: ");
        int length = cin.nextInt();
        System.out.println("請輸入寬: ");
        int width = cin.nextInt();
        System.out.println("請輸入高: ");
        int height = cin.nextInt();
        double v=volume(length,width,height);
        double s=surfaceArea(length,width,height);
        System.out.println("體積: " + v);
        System.out.println("表面積: " + s);        
    }
}
