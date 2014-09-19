package maven_grp.MavenProject;

import java.io.File;
import java.io.IOException;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

import org.testng.annotations.Test;

public class ExcelCreate {
  @Test
  public void createExcelSheet() throws IOException, RowsExceededException, WriteException {
	  
	  WritableWorkbook book = Workbook.createWorkbook(new File("./src/test/Book2.xls"));
	  WritableSheet sheet = book.createSheet("Master", 0);
	  
	  Label l1 = new Label(1, 2, "Peter");
	  sheet.addCell(l1);
	  
	  book.write();
	  book.close();
	  
  }
}
