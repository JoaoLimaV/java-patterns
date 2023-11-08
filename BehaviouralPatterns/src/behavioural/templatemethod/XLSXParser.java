package behavioural.templatemethod;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XLSXParser extends DataParser {

	@Override
	protected List<String> readData() {
		// TODO Auto-generated method stub
		List<String> data = new ArrayList<>();
		
		try {
			FileInputStream file = new FileInputStream(new File(path));
			XSSFWorkbook workbook = new XSSFWorkbook(file);
			Sheet sheet = workbook.getSheetAt(0);
			
			for( Row row : sheet) {
				data.add(row.getCell(0).getStringCellValue());
			}
			workbook.close();
			file.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return data;
	}

	@Override
	protected void writeData(List<String> data) {
		// TODO Auto-generated method stub
		try {
			XSSFWorkbook workbook = new XSSFWorkbook();
			Sheet sheet = workbook.createSheet();
			
			for(int i = 0; i < data.size(); i++) {
				sheet.createRow(i).createCell(0).setCellValue(data.get(i));
			}
			FileOutputStream file = new FileOutputStream(new File(path));
			
			workbook.write(file);
			workbook.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
