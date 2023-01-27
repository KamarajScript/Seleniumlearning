package com.sample.basics;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class xlswrite {

    public void WriteXls() throws IOException {
        File file = new File("D://DemoFile.xlsx");
        FileInputStream fs = new FileInputStream(file);
        try (XSSFWorkbook wb = new XSSFWorkbook(fs)) {
            XSSFSheet sheet = wb.getSheet("Test");
            int rowcount = sheet.getLastRowNum() - sheet.getFirstRowNum();
            System.out.println("Row Count is:" + rowcount);
            for (int i = 1; i <= rowcount; i++) {
                int cellcount = sheet.getRow(i).getLastCellNum();
                // System.out.println("cell Count is:" + cellcount);
                for (int j = 0; j < cellcount; j++) {
                    System.out.println(sheet.getRow(i).getCell(j).getStringCellValue());
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        xlswrite xs = new xlswrite();
        xs.WriteXls();
    }
}
