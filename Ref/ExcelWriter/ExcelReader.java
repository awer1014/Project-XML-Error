import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
public class ExcelReader {
    public List<StudentScore> read(String fileName) throws EncryptedDocumentException, IOException {
        if (fileName == null) return null;
        File xlsFile = new File(fileName);
        if (!xlsFile.exists()) return null;
        // 工作表
        Workbook workbook = WorkbookFactory.create(xlsFile);
        // 表個數
        int numberOfSheets = workbook.getNumberOfSheets();
        //        System.out.println(numberOfSheets);
        if (numberOfSheets <= 0) return null;
        List<StudentScore> list = new ArrayList<>();
        //我們的需求只需要處理一個表，因此不需要遍歷
        Sheet sheet = workbook.getSheetAt(0);
        // 行數
        int rowNumbers = sheet.getLastRowNum() + 1;
        //        System.out.println(rowNumbers);
        StudentScore score;
        // 讀數據，第二行開始讀取
        for (int row = 1; row < rowNumbers; row++) {
            Row r = sheet.getRow(row);
            //            System.out.println(r.getPhysicalNumberOfCells());
            //我們只需要前兩列
            if (r.getPhysicalNumberOfCells() >= 2) {
                score = new StudentScore(r.getCell(0).toString(), (int) Double.parseDouble(r.getCell(1).toString()));
                list.add(score);
            } 
        }
        return list;
    }
}