package az.edu.turing.seleniumPart02.lesson01;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadingDataFromExcel {

    // Excel File-->Workbook-->Sheets-->Rows-->Cells
    public static void main(String[] args) throws IOException {
        // First part open excel file
        FileInputStream file = new FileInputStream("C:\\Users\\ASUS\\Desktop\\Kitap1.xlsx");

        XSSFWorkbook workbook = new XSSFWorkbook(file);
        XSSFSheet sheet = workbook.getSheet("Data");
        int totalRows = sheet.getLastRowNum();
        int totalCells = sheet.getRow(0).getLastCellNum();

        System.out.println("Number of rows: " + totalRows);
        System.out.println("Number of cells: " + totalCells);
        for (int i = 0; i <= totalRows; i++) {  // rows start from 0
            XSSFRow currentRow = sheet.getRow(i);
            if (currentRow != null) {
                for (int j = 0; j < totalCells; j++) {
                    XSSFCell cell = currentRow.getCell(j);
                    if (cell != null) {
                        System.out.println(cell.toString());
                    } else {
                        System.out.println("Empty Cell");
                    }
                }
            } else {
                System.out.println("Empty Row");
            }
        }
        workbook.close();
        file.close();
    }
}
