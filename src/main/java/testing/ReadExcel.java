package testing;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

    @SuppressWarnings("deprecation")
    public static void main() throws IOException {
        String excelFilePath = "C:\\Users\\6000827\\Downloads\\test.xlsm";
        FileInputStream inputStream = new FileInputStream(new File(excelFilePath));

        Workbook workbook = new XSSFWorkbook(inputStream);
        Sheet sheet = workbook.getSheetAt(0);

        int rownum = 10;
        int maxrow = 49;
        int colnum = sheet.getPhysicalNumberOfRows();
        System.out.println(rownum + "/" + maxrow);

        int rowStart = 9;
        int rowEnd = sheet.getLastRowNum() - 32;
        for (int rowNum = rowStart; rowNum < rowEnd; rowNum++) {
            Row r = sheet.getRow(rowNum);
            if (r == null) {
                // This whole row is empty
                // Handle it as needed
                System.out.println("Empty");
                continue;
            }

            int lastColumn = r.getLastCellNum();

            for (int cn = 0; cn < lastColumn; cn++) {
                Cell c = r.getCell(cn, Row.RETURN_BLANK_AS_NULL);
                if (c == null) {
                    System.out.print("- | ");
                } else {
                    switch (c.getCellType()) {
                    case Cell.CELL_TYPE_STRING:
                        System.out.print(c.getStringCellValue());
                        break;
                    case Cell.CELL_TYPE_BOOLEAN:
                        System.out.print(c.getBooleanCellValue());
                        break;
                    case Cell.CELL_TYPE_NUMERIC:
                        System.out.print(c.getNumericCellValue());
                        break;
                    case Cell.CELL_TYPE_BLANK:
                        System.out.print(" ");
                        break;
                    case Cell.CELL_TYPE_FORMULA:
                        switch (c.getCachedFormulaResultType()) {
                        case Cell.CELL_TYPE_NUMERIC:
                            System.out.print(c.getNumericCellValue());
                            break;
                        case Cell.CELL_TYPE_STRING:
                            System.out.print(c.getRichStringCellValue());
                            break;

                        default:
                            break;
                        }
                    }
                    System.out.print(" | ");

                }

            }
            System.out.println();
        }

        // Iterator<Row> iterator = sheet.iterator();
        //
        // while (iterator.hasNext()) {
        // Row nextRow = iterator.next();
        // Iterator<Cell> cellIterator = nextRow.cellIterator();
        //
        // while (cellIterator.hasNext()) {
        // Cell cell = cellIterator.next();
        //

        workbook.close();
        inputStream.close();

    }

}