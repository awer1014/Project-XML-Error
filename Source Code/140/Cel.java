public class Cel{
	static double degree;
	static double ans(double degree){
		return degree*9.0/5.0+32.0;
	}
	
    public static void main(String[] args){
		
        double degree = Double.parseDouble(args[0]);
        System.out.println( degree + " ��C = " + Cel.ans(degree));
    }
}


/*
���D�w�q�G�����ؤ�
���O��ơGdegree 
���O�ʧ@�Gans
���յ��G�G���\
�������G�G4
*/