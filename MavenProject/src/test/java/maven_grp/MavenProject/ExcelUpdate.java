package maven_grp.MavenProject;

import java.io.File;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

import org.testng.annotations.Test;

public class ExcelUpdate {
	@Test
	public void updateExcelSheet() throws BiffException, IOException, RowsExceededException, WriteException {
		Workbook oldBook = Workbook.getWorkbook(new File("./src/test/Book1.xls"));
		WritableWorkbook newBook = Workbook.createWorkbook(new File("./src/test/new_excel.xls"), oldBook);
		
		WritableSheet sheet = newBook.getSheet("Master");
		
		Label l1 = new Label(5, 6, "Allen");
		sheet.addCell(l1);
		
		newBook.write();
		newBook.close();
		oldBook.close();
				
	}
}
