package main;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFFormulaEvaluator;

public class App 
{
    public static void main( String[] args )
    {
        final int ROW_START = 3;
        final int COL_DAY_START = 2;
        Workbook workbook;
        Student[] students = new Student[10];
        students[0] = new Student("Ifaldzi", "016", new float[]{5, 6, 7, 8, 9, 2, 0});
        students[1] = new Student("Alwi", "024", new float[]{3, 4, 5, 4, 1, 2, 1});
        students[2] = new Student("Hudhori", "056", new float[]{3.2f, 5.5f, 5, 7, 3, 2, 1.5f});
        students[3] = new Student("Kevin", "001", new float[]{7, 8, 5.5f, 7.5f, 0, 4, 0});
        students[4] = new Student("Yu", "066", new float[]{2, 8.5f, 2, 3, 4, 0, 0});
        students[5] = new Student("Akarin", "099", new float[]{0, 3, 0, 1, 2, 4.4f, 5});

        try
        {
            FileInputStream inputStream = new FileInputStream("src/main/java/Timesheet.xlsx");
            workbook = WorkbookFactory.create(inputStream);
            Sheet sheet = workbook.getSheet("Timesheet");

            for(int i=0;i<students.length;i++)
            {
                if(students[i] == null) continue;
                Row row = sheet.getRow(i+ROW_START);
                row.createCell(0).setCellValue(students[i].getName());
                row.createCell(1).setCellValue(students[i].getStudentCode());
                for(int j=0;j<students[i].getTaskHourPerDay().length;j++)
                {
                    row.createCell(j+COL_DAY_START).setCellValue(students[i].getTaskHourPerDay()[j]);
                }
            }
            
            XSSFFormulaEvaluator.evaluateAllFormulaCells(workbook);

            inputStream.close();

            FileOutputStream outputStream = new FileOutputStream("src/main/java/Timesheet.xlsx");
            workbook.write(outputStream);
            System.out.println("File Excel Timesheet Pengerjaan Tugas Telah Dibuat");
            outputStream.close();
        }
        catch(IOException exception)
        {

        }
    }
}
