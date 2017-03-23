package testing;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.becarios.proyecto_definitivo.model.Modulo;

public class ReadExcel {

    @SuppressWarnings("deprecation")
    public static void main() throws IOException {
        String excelFilePath = "C:\\Users\\6000827\\Downloads\\test.xlsm";
        FileInputStream inputStream = new FileInputStream(new File(excelFilePath));

        Workbook workbook = new XSSFWorkbook(inputStream);
        Sheet sheet = workbook.getSheetAt(0);

        int rownum = 10;
        int maxrow = 49;
        System.out.println(rownum + "/" + maxrow);

        int rowStart = 9;
        int rowEnd = sheet.getLastRowNum() - 32;
        for (int rowNum = rowStart; rowNum < rowEnd; rowNum++) {
            System.out.println("== ROW - " + (rowNum + 1) + " ==");
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
                    // System.out.print("?");
                    // System.out.print(" | ");
                } else {

                    pass(cn, c, new Modulo());
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

    @SuppressWarnings("deprecation")
    private static void pass(int cn, Cell c, Modulo m) {
        switch (cn) {
        case 1:
            System.out.print("Name: ");
            m.setName(c.getStringCellValue());
            System.out.println(c.getStringCellValue());
            break;
        case 3:
            System.out.print("Code: ");
            m.setCode(c.getStringCellValue());
            System.out.println(c.getStringCellValue());
            break;
        case 4:
            System.out.print("Case of use: ");
            m.setCaseOfUse(c.getStringCellValue());
            System.out.println(c.getStringCellValue());
            break;
        case 5:
            System.out.print("Perfiles NRO: ");
            c.getNumericCellValue();
            System.out.println(c.getNumericCellValue());
            break;
        case 6:
            System.out.print("Perfiles complejidad: ");
            m.setCaseOfUse(c.getStringCellValue());
            System.out.println(c.getStringCellValue());
            break;

        default:
            break;
        }
    }

    private static void checktype(Cell c) {
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

    }

}