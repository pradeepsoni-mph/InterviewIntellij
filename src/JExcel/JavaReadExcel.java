package JExcel;

import java.util.*;
import java.io.*;
import jxl.*;

/* Download "jexcelapi_2_6_12.tar" form below givn the link 
Extract it then got "jexcelapi" folder and inside this folder
 find "jxl.jar" that is an executable jar, now extract it
and then get "jxl" folder that contains Workbook,Sheet,Cell classes
and make a AP.xls Excel file which data we want to read.
*/

//http://www.andykhan.com/jexcelapi/download.html

public class JavaReadExcel
{
    public static void main(String st[])
    {
       readFile(); 
    }

    public static void readFile() 
    {         
         try
         {
  	
             Workbook workbook = Workbook.getWorkbook(new File("AP.xls"));

             String sheetName[]=workbook.getSheetNames();
             Sheet sheet;
             Cell xlsCell;  //one value(one cell).
             Cell[] cell;  //row
	
             for(int p=0; p<sheetName.length; p++)
             {
                 sheet = workbook.getSheet(p);
		 
                 for(int i=0; i<sheet.getRows(); i++)
                 {

                     cell = sheet.getRow(i);

		     System.out.println();
                     for(int j=0; j<cell.length; j++)
                     {
                         xlsCell = sheet.getCell(j,i);
                         System.out.print(xlsCell.getContents().toString() + " ");
                     }
                 }
             }
         }
         catch(Exception exec)
         {
             System.out.print("Exception pradeep "+exec);
         }
    
     }

 } 

/**************OUTPUT*************************
pradeep pandey 1234 
pradeep pandey 1234 
pradeep pandey 1234 
pradeep pandey 1234 
pradeep pandey 1234 
pradeep pandey 1234 
pradeep pandey 1234 
pradeep pandey 1234 
pradeep pandey 1234 
pradeep pandey 1234 
pradeep pandey 1234 
pradeep pandey 1234 
pradeep pandey 1234 
pradeep pandey 1234 
pradeep pandey 1234 
pradeep pandey 1234 
pradeep pandey 1234 
pradeep pandey 1234 
pradeep pandey 1234 
pradeep pandey 1234 
pradeep pandey 1234 
pradeep pandey 1234 
******************************************/
