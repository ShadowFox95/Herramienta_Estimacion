package testing;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;

import com.becarios.proyecto_definitivo.dto.ProyectoDto;
import com.becarios.proyecto_definitivo.dto.condicionantes.CondicionantesDto;
import com.becarios.proyecto_definitivo.dto.condicionantes.CondicionantesIdDto;
import com.becarios.proyecto_definitivo.dto.criterios.CasosDeUsoDto;
import com.becarios.proyecto_definitivo.dto.criterios.CasosDeUsoIdDto;
import com.becarios.proyecto_definitivo.dto.criterios.CuoriginalDto;
import com.becarios.proyecto_definitivo.dto.criterios.IntegracionDto;
import com.becarios.proyecto_definitivo.dto.criterios.NegocioDto;
import com.becarios.proyecto_definitivo.dto.criterios.PerfilesDto;
import com.becarios.proyecto_definitivo.dto.criterios.PersistenciaDto;
import com.becarios.proyecto_definitivo.dto.criterios.VistaDto;
import com.becarios.proyecto_definitivo.dto.factores_ajuste.ArquitecturaReferenciaDto;
import com.becarios.proyecto_definitivo.dto.factores_ajuste.FactorAjusteDto;
import com.becarios.proyecto_definitivo.dto.factores_ajuste.FactorComplejidadAmbientalDto;
import com.becarios.proyecto_definitivo.dto.factores_ajuste.FactorComplejidadTecnicaDto;
import com.becarios.proyecto_definitivo.dto.horas_costes.DeliveryDto;
import com.becarios.proyecto_definitivo.dto.horas_costes.DeliveryexternoDto;
import com.becarios.proyecto_definitivo.dto.horas_costes.GestionDto;
import com.becarios.proyecto_definitivo.dto.horas_costes.GestionexternoDto;
import com.becarios.proyecto_definitivo.dto.horas_costes.GobiernoDto;
import com.becarios.proyecto_definitivo.dto.horas_costes.GobiernoexternoDto;
import com.becarios.proyecto_definitivo.dto.horas_costes.RiesgoDto;
import com.becarios.proyecto_definitivo.dto.horas_costes.ValoracionfinalDto;
import com.becarios.proyecto_definitivo.dto.itr.ItrDto;
import com.becarios.proyecto_definitivo.model.Modulo;

public class ReadExcel {

    ProyectoDto proyecto = new ProyectoDto();
    CondicionantesDto condicionantes = new CondicionantesDto();
    CondicionantesIdDto condicionantesId = new CondicionantesIdDto();
    CasosDeUsoDto CasosDeUso = new CasosDeUsoDto();
    CasosDeUsoIdDto CasosDeUsoId = new CasosDeUsoIdDto();
    CuoriginalDto cu = new CuoriginalDto();
    IntegracionDto integracion = new IntegracionDto();
    NegocioDto negocio = new NegocioDto();
    PerfilesDto perfiles = new PerfilesDto();
    PersistenciaDto persistencia = new PersistenciaDto();
    VistaDto vista = new VistaDto();
    ArquitecturaReferenciaDto arquitecturaReferencia = new ArquitecturaReferenciaDto();
    FactorAjusteDto factorAjuste = new FactorAjusteDto();
    FactorComplejidadTecnicaDto factorComplejidadTecnica = new FactorComplejidadTecnicaDto();
    FactorComplejidadAmbientalDto factorComplejidadAmbiental = new FactorComplejidadAmbientalDto();
    DeliveryDto delivery = new DeliveryDto();
    DeliveryexternoDto deliveryExterno = new DeliveryexternoDto();
    GestionDto gestion = new GestionDto();
    GestionexternoDto gestionExterno = new GestionexternoDto();
    GobiernoDto Gobierno = new GobiernoDto();
    GobiernoexternoDto gobiernoExterno = new GobiernoexternoDto();
    RiesgoDto riesgo = new RiesgoDto();
    ValoracionfinalDto valoracionFinal = new ValoracionfinalDto();
    ItrDto itr = new ItrDto();

    @SuppressWarnings("deprecation")
    public static void Importar() throws IOException {
        String excelFilePath = "C:\\Users\\6000827\\Downloads\\test.xlsm";
        FileInputStream inputStream = new FileInputStream(new File(excelFilePath));

        Workbook workbook = new XSSFWorkbook(inputStream);

        getProjectParameters(workbook);
        getCriteriosParameters(workbook);
        getFactoresAjusteParameters(workbook);
        getHorasCostesParameters(workbook);

        workbook.close();
        inputStream.close();

    }

    private static void getProjectParameters(Workbook workbook) {

    }

    private static void getCriteriosParameters(Workbook workbook) {

    }

    private static void getFactoresAjusteParameters(Workbook workbook) {

    }

    private static void getHorasCostesParameters(Workbook workbook) {

    }

    private static void getCondicionantesParameters(Workbook workbook) {

    }

    private static void getItrParameters(Workbook workbook) {

    }

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

    @Autowired
    @SuppressWarnings("deprecation")
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

    private void plantilla(Workbook workbook) {
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

    }

}