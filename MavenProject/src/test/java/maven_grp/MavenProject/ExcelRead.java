package maven_grp.MavenProject;

import java.io.File;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import org.testng.annotations.Test;

public class ExcelRead {
	@Test
	public void readExcelSheet() throws BiffException, IOException {
		Workbook book = Workbook.getWorkbook(new File("./src/test/Book1.xls"));
		Sheet master = book.getSheet("Master");

		// String name = master.getCell(1, 2).getContents();
		// System.out.println("Name: " + name);

		for (int i = 0; i < master.getColumns(); i++) {
			for (int j = 0; j < master.getRows(); j++) {
				System.out.println(master.getCell(i, j).getContents());
			}
			System.out.println();
		}

		book.close();
	}
}
