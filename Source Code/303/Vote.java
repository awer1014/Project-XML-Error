import java.util.*;
class Vote{
    static double sum = 0;
    static int Data;
    String name;
    double n;
    
    Vote(){
        this.name = name;
        this.n = n;
    }
    String setname(){
        return name;
    }
    double setn(){
        return n;
    }
    public static void main(String[] args){
        System.out.println("請輸入有幾位候選人(最多10位) : ");
        Scanner scanner = new Scanner(System.in);
        Data = scanner.nextInt();
        Vote[] x = new Vote[10];
        for(int k = 0;k < 10;k++){
            x[k] = new Vote();
        }
        Scanner scn = new Scanner(System.in);
        for(int i = 0;i < Data;i++){
            System.out.println("請輸入第" + (i+1) + "位候選人的姓名和得票數");
            x[i].name = scn.next();
            x[i].n = scn.nextInt();
        }
        for(int m = 0;m < Data;m++){
            sum = sum + x[m].setn();
        }
        System.out.println("候選人");
        for(int j = 0;j < Data;j++){
            System.out.println(x[j].setname()+ " " + x[j].setn() + " " + x[j].setn() / sum * 100 + "%");
        }
        if(x[0].setn() > x[1].setn()&& x[0].setn() > x[2].setn() && x[0].setn() > x[3].setn() && x[0].setn() > x[4].setn() && x[0].setn() > x[5].setn() && x[0].setn() > x[6].setn() && x[0].setn() > x[7].setn() && x[0].setn() > x[8].setn() && x[0].setn() > x[9].setn()){
            System.out.println(x[0].setname()+ " " + x[0].setn() + " " + x[0].setn() / sum * 100 + "%");
        }
        if(x[1].setn() > x[0].setn() && x[1].setn() > x[2].setn() && x[1].setn() > x[3].setn() && x[1].setn() > x[4].setn() && x[1].setn() > x[5].setn() && x[1].setn() > x[6].setn() && x[1].setn() > x[7].setn() && x[1].setn() > x[8].setn() && x[1].setn() > x[9].setn()){
            System.out.println(x[1].setname()+ " " + x[1].setn() + " " + x[1].setn() / sum * 100 + "%");
        }
        if(x[2].setn() > x[0].setn() && x[2].setn() > x[1].setn() && x[2].setn() > x[3].setn() && x[2].setn() > x[4].setn() && x[2].setn() > x[5].setn() && x[2].setn() > x[6].setn() && x[2].setn() > x[7].setn() && x[2].setn() > x[8].setn() && x[2].setn() > x[9].setn()){
            System.out.println("當選人");
            System.out.println(x[2].setname()+ " " + x[2].setn() + " " + x[2].setn() / sum * 100 + "%");
        }
        if(x[3].setn() > x[0].setn() && x[3].setn() > x[1].setn() && x[3].setn() > x[2].setn() && x[3].setn() > x[4].setn() && x[3].setn() > x[5].setn() && x[3].setn() > x[6].setn() && x[3].setn() > x[7].setn() && x[3].setn() > x[8].setn() && x[3].setn() > x[9].setn()){
            System.out.println("當選人");
            System.out.println(x[3].setname()+ " " + x[3].setn() + " " + x[3].setn() / sum * 100 + "%");
        }
        if(x[4].setn() > x[0].setn() && x[4].setn() > x[1].setn() && x[4].setn() > x[2].setn() && x[4].setn() > x[3].setn() && x[4].setn() > x[5].setn() && x[4].setn() > x[6].setn() && x[4].setn() > x[7].setn() && x[4].setn() > x[8].setn() && x[4].setn() > x[9].setn()){
            System.out.println("當選人");
            System.out.println(x[4].setname()+ " " + x[4].setn() + " " + x[4].setn() / sum * 100 + "%");
        }
        if(x[5].setn() > x[0].setn() && x[5].setn() > x[1].setn() && x[5].setn() > x[2].setn() && x[5].setn() > x[3].setn() && x[5].setn() > x[4].setn() && x[5].setn() > x[6].setn() && x[5].setn() > x[7].setn() && x[5].setn() > x[8].setn() && x[5].setn() > x[9].setn()){
            System.out.println("當選人");
            System.out.println(x[5].setname()+ " " + x[5].setn() + " " + x[5].setn() / sum * 100 + "%");
        }
        if(x[6].setn() > x[0].setn() && x[6].setn() > x[1].setn() && x[6].setn() > x[2].setn() && x[6].setn() > x[3].setn() && x[6].setn() > x[4].setn() && x[6].setn() > x[5].setn() && x[6].setn() > x[7].setn() && x[6].setn() > x[8].setn() && x[6].setn() > x[9].setn()){
            System.out.println("當選人");
            System.out.println(x[6].setname()+ " " + x[6].setn() + " " + x[6].setn() / sum * 100 + "%");
        }
        if(x[7].setn() > x[0].setn() && x[7].setn() > x[1].setn() && x[7].setn() > x[2].setn() && x[7].setn() > x[3].setn() && x[7].setn() > x[4].setn() && x[7].setn() > x[5].setn() && x[7].setn() > x[6].setn() && x[7].setn() > x[8].setn() && x[7].setn() > x[9].setn()){
            System.out.println("當選人");
            System.out.println(x[7].setname()+ " " + x[7].setn() + " " + x[7].setn() / sum * 100 + "%");
        }
        if(x[8].setn() > x[0].setn() && x[8].setn() > x[1].setn() && x[8].setn() > x[2].setn() && x[8].setn() > x[3].setn() && x[8].setn() > x[4].setn() && x[8].setn() > x[5].setn() && x[8].setn() > x[6].setn() && x[8].setn() > x[7].setn() && x[8].setn() > x[9].setn()){
            System.out.println("當選人");
            System.out.println(x[8].setname()+ " " + x[8].setn() + " " + x[8].setn() / sum * 100 + "%");
        }
        if(x[9].setn() > x[0].setn() && x[9].setn() > x[1].setn() && x[9].setn() > x[2].setn() && x[9].setn() > x[3].setn() && x[9].setn() > x[4].setn() && x[9].setn() > x[5].setn() && x[9].setn() > x[6].setn() && x[9].setn() > x[7].setn() && x[9].setn() > x[8].setn()){
            System.out.println("當選人");
            System.out.println(x[9].setname()+ " " + x[9].setn() + " " + x[9].setn() / sum * 100 + "%");
        }
    }
}