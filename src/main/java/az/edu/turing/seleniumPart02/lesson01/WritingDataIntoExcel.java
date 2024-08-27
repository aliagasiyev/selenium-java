package az.edu.turing.seleniumPart02.lesson01;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WritingDataIntoExcel {
    public static void main(String[] args) throws IOException {
        // Path to your existing Excel file
        String filePath = "C:\\Users\\ASUS\\Desktop\\Kitap1.xlsx";

        // Open the existing file
        FileInputStream fileInputStream = new FileInputStream(filePath);
        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
        XSSFSheet sheet = workbook.getSheet("Data");

        if (sheet == null) {
            // If the sheet doesn't exist, create it
            sheet = workbook.createSheet("Data");
        }

        // Find the last row number
        int lastRowNum = sheet.getLastRowNum();

        // Add new rows and cells with data
        XSSFRow row1 = sheet.createRow(lastRowNum + 1);
        row1.createCell(0).setCellValue("Java");
        row1.createCell(1).setCellValue("Akif");
        row1.createCell(2).setCellValue("Salam");

        XSSFRow row2 = sheet.createRow(lastRowNum + 2);
        row2.createCell(0).setCellValue("Rauf");
        row2.createCell(1).setCellValue("Rasim");
        row2.createCell(2).setCellValue("Salman");

        XSSFRow row3 = sheet.createRow(lastRowNum + 3);
        row3.createCell(0).setCellValue("SalamEleykum");
        row3.createCell(1).setCellValue("Vuqar");
        row3.createCell(2).setCellValue("Ogladni");

        // Close the input stream
        fileInputStream.close();

        // Write the changes back to the file
        FileOutputStream fileOutputStream = new FileOutputStream(filePath);
        workbook.write(fileOutputStream);

        // Close the output stream
        fileOutputStream.close();
        workbook.close();

        System.out.println("Data written to the Excel file successfully.");
    }
}
