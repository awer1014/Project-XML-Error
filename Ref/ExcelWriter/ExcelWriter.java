import java.io.File;
import java.io.IOException;
import java.util.List;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
public class ExcelWriter {
    public void write(String fileName, List<StudentScore> list)  {
        HSSFWorkbook workbook = new HSSFWorkbook();
        HSSFSheet sheet = workbook.createSheet("StudentScore");
        // 創建Excel標題行，第一行
        HSSFRow headRow = sheet.createRow(0);
        headRow.createCell(0).setCellValue("姓名");
        headRow.createCell(1).setCellValue("分數");
        // 往Excel表中遍歷寫入數據
        for (StudentScore studentScore : list) {
            createCell(studentScore, sheet);
        }
        File xlsFile = new File(fileName);
        try {
            // 或者以流的形式寫入文件 workbook.write(new FileOutputStream(xlsFile));
            workbook.write(xlsFile);
        } catch (IOException e) {
            // TODO
        } finally {
            try {
                workbook.close();
            } catch (IOException e) {
                // TODO
            }    
        }
    }
    // 創建Excel的一行數據。
    private void createCell(StudentScore studentScore, HSSFSheet sheet) {
        HSSFRow dataRow = sheet.createRow(sheet.getLastRowNum() + 1);
        dataRow.createCell(0).setCellValue(studentScore.getName());
        dataRow.createCell(1).setCellValue(studentScore.getScore());
    }
}