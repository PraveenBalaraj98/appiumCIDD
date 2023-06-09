package com.qa.nobero.genericutility;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


/**
 * @author Praveen B
 */
public class ExcelUtility {

    /**
     * Use this method to read data from excel sheet and file path are taken from FilePaths interface
     *
     * @param sheetName
     * @param rowNo
     * @param cellNo
     * @return Excel cell value in string
     */
    public static String getExcelData(String sheetName, int rowNo, int cellNo) {
        try {
            FileInputStream file = new FileInputStream(IConstants.excelPath);
            Workbook workbook = WorkbookFactory.create(file);
            return workbook.getSheet(sheetName).getRow(rowNo).getCell(cellNo).getStringCellValue();
        } catch (Exception e) {
            System.out.println("File not found");
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Method read data based on testcase id and the column name/test data cell
     *
     * @param sheetName
     * @param testcaseID
     * @param columnName
     * @return Cell String value
     */
    public static String getExcelData(String sheetName, String testcaseID, String columnName) {
        try {
            FileInputStream file = new FileInputStream(IConstants.excelPath);
            Workbook workbook = WorkbookFactory.create(file);
            Sheet sheet = workbook.getSheet(sheetName);
            int lastRow = sheet.getLastRowNum();
            int testRow = 0;
            for (int i = 0; i <= lastRow; i++) {
                try {
                    String testcaseNum = sheet.getRow(i).getCell(0).getStringCellValue();
                    if (testcaseNum.equalsIgnoreCase(testcaseID))
                    {
                        testRow = i;
                        break;
                    }
                } catch (NullPointerException e) {

                }
            }
            int lastCell = sheet.getRow(testRow - 1).getLastCellNum();
            int testcell = 0;
            for (int i = 0; i <= lastCell; i++) {
                try {
                    String cellData = sheet.getRow(testRow - 1).getCell(i).getStringCellValue();
                    if (cellData.equalsIgnoreCase(columnName)) {
                        testcell = i;
                        break;
                    }
                } catch (NullPointerException e) {
                }
            }
            return getExcelData(sheetName, testRow, testcell);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return "No Data found";
    }

    /**
     * Method used to write data into excel sheet
     *
     * @param sheetName
     * @param rowNum
     * @param cellNum
     * @param cellValue
     */
    public void writeDataToExcel(String sheetName, int rowNum, int cellNum, String cellValue) {
        
        try {
            FileInputStream file = new FileInputStream(IConstants.excelPath);
            Workbook workbook = WorkbookFactory.create(file);
            Sheet sheet = workbook.getSheet(sheetName);
            sheet.createRow(rowNum).createCell(cellNum).setCellValue(cellValue);
            FileOutputStream fileOut = new FileOutputStream(IConstants.excelPath);
            workbook.write(fileOut);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public Object[][] readDataToExcel(String sheetName){
        //logger
        try {
            FileInputStream file = new FileInputStream(IConstants.excelPath);
            Workbook workbook = WorkbookFactory.create(file);
            Sheet sheet = workbook.getSheet(sheetName);
           int rowNum = sheet.getLastRowNum();
          int cellNum = sheet.getRow(0).getLastCellNum();
          Object[][] data=new Object[rowNum][cellNum];
          for (int i=0;i< rowNum;i++){
              for(int j=0;j<cellNum;j++)
              {
                    data[i][j]=sheet.getRow(i).getCell(j).getStringCellValue();
              }
          }
          return data;
        } catch (Throwable e) {
            e.printStackTrace();
        }
        return new Object[0][0];
    }
}


//	public String getExcelData(String sheetName , int rowNum , int celNum) throws Throwable  {
//	
//		FileInputStream fis = new FileInputStream(IConstants.EXCELPATH);
//		Workbook wb = WorkbookFactory.create(fis);
//		DataFormatter formatter=new DataFormatter();
//		String data = formatter.formatCellValue(wb.getSheet(sheetName).getRow(rowNum).getCell(celNum));
//		
//		return data;
//	}
//	
//	
//	/**
//	 * used to get the last used row number on specified Sheet
//	 * @param sheetName
//	 * @return LastRowCount
//	 * @throws Throwable
//	 */
//	public int getRowCount(String sheetName) throws Throwable {
//		FileInputStream fis  = new FileInputStream(IConstants.EXCELPATH);
//		Workbook wb = WorkbookFactory.create(fis);
//		Sheet sh = wb.getSheet(sheetName);
//		wb.close();
//		return sh.getLastRowNum();
//	}
//	
//	
//	/**
//	 * used to write data back to Excel based on below parameter
//	 * @param sheetName
//	 * @param rowNum
//	 * @param celNum
//	 * @param data
//	 * @throws Throwable
//	 */
//	public void setDataExcel(String sheetName , int rowNum, int celNum ,String data) throws Throwable {
//		FileInputStream fis  = new FileInputStream(IConstants.EXCELPATH);
//		Workbook wb = WorkbookFactory.create(fis);
//		Sheet sh = wb.getSheet(sheetName);
//		Row row = sh.getRow(rowNum);
//		Cell cel = row.createCell(celNum);
//		cel.setCellValue(data);
//		FileOutputStream fos = new FileOutputStream(IConstants.EXCELPATH);
//		wb.write(fos);
//		wb.close();
//	}
//
//}
//
//
//
