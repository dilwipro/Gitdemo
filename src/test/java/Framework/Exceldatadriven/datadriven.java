package Framework.Exceldatadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class datadriven {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file=new File("H:\\Selenium2022\\TestData\\Datadriven.xlsx");
		
		FileInputStream fis=new FileInputStream(file);
		System.out.println("dileep");
		
		XSSFWorkbook workb=new XSSFWorkbook(fis);
		
	//	int count=workb.getNumberOfSheets();
	//	System.out.println(count);
		
		
		

	}

}
