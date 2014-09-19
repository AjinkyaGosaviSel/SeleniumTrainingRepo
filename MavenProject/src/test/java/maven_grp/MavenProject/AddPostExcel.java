package maven_grp.MavenProject;

import java.io.File;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import org.testng.annotations.Test;

public class AddPostExcel {
	@Test
	public void addPostThroughExcel() throws BiffException, IOException {
		Workbook book = Workbook
				.getWorkbook(new File("./src/test/AddPost.xls"));
		Sheet master = book.getSheet("Post");
		
		// TODO - Read Excel sheet to create 5 posts
		
	}
}
