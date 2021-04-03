
public class example
{
    // 实例变量 - 用你自己的变量替换下面的例子
    private String[][] BE_array = new String[36][12];//Begin&End的陣列,錯誤最多總數為6
    private String[] Error_array = new String[36]; 
    private String[] Error_array_temp;
    private String begin,end;
    int Error_sum=0;
    private String Error_type;//你抓到的錯誤類型
    public int sampleMethod(int y)
    {
        if(map.containsKey(Error_type)){
            Error_array[map.get(Error_type)]++;
            Error_array_temp[Error_sum++]=map.get(Error_type);
            
        }
        for(int i=0; i<Error_array_temp.length*2;){
            BE_array[ map.get( Error_array_temp[i] ) ][i]=begin;
            i++;
            BE_array[ map.get( Error_array_temp[i] ) ][i]=end;
            i++;
        }
        
        
    }
}
