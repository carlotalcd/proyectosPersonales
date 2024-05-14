
package el_corte_ingles;

import br.com.adilson.util.Extenso;
import br.com.adilson.util.PrinterMatrix;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.LocalTime;
import javax.print.Doc;
import javax.print.DocFlavor;
import javax.print.DocPrintJob;
import javax.print.PrintException;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.print.SimpleDoc;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;

/**
 *
 * @author Usuario
 */
public class Impresion_ticket {
    
    /**
     *
     * @param args
     */
    public static void main (String[] args){
    PrinterMatrix printer = new PrinterMatrix();
    
    
    String NumeroFactura="B001";
    String NombreVendedor="Carlota";
    String NombreComprador="Pedro";
    
   
    
    Extenso e = new Extenso();
    
    e.setNumber(101.85);
    
    printer.setOutSize(9, 32);
    
    printer.printCharAtCol(1, 1, 32, "=");
    
    printer.printTextWrap(1, 2, 8, 32, "FACTURA DE VENTA");
    printer.printTextWrap(2, 3, 1, 32, "NUMERO DE TICKET :" +NumeroFactura);
    printer.printTextWrap(3, 3, 1, 32, "DIA DE LA COMPRA :" +"  "+LocalDate.now());
    printer.printTextWrap(4, 3, 1, 32, "HORA DE LA COMPRA :" +" "+ LocalTime.now() );
    printer.printTextWrap(5, 3, 1, 32, "VENDEDOR :" +NombreVendedor);
    printer.printTextWrap(6 , 3, 1, 32, "COMPRADOR :" +NombreComprador);
    
    printer.toFile("impresion.txt");
    
    FileInputStream inputStream = null;
    
    try{
        inputStream = new FileInputStream("impresion.txt");
    } catch (FileNotFoundException ex){
        ex.printStackTrace();
    }
        if(inputStream == null){
            return;
        }
        
        DocFlavor docFormat = DocFlavor.INPUT_STREAM.AUTOSENSE;
        Doc document = new SimpleDoc(inputStream,docFormat,null);
        
        PrintRequestAttributeSet attributeSet = new HashPrintRequestAttributeSet();
        PrintService defaultPrintService = PrintServiceLookup.lookupDefaultPrintService();
        
        if(defaultPrintService!=null){
            DocPrintJob printJob = defaultPrintService.createPrintJob();
            try{
                printJob.print(document,attributeSet);
            }catch (Exception ex){
                System.out.println("Error : " + ex.toString());
            }
        }else{
            System.out.println("No hay una impresora instalada");
        }
        
            }
}
