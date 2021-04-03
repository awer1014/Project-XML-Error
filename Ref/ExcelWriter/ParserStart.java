import java.util.Collections;
import java.util.List;
public class ParserStart {
    public static void main(String[] args) throws Exception {
        // 第一步：讀取數據
        List<StudentScore> dataList = new ExcelReader().read("resource/input.xls");
        System.out.println(dataList);
        // 第二步：排序
        Collections.sort(dataList);
        System.out.println(dataList);
        // 第三部：寫入數據
        new ExcelWriter().write("resource/output.xls", dataList);
    }
}