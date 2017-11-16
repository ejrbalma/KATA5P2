package kata5v2017V1;

import java.io.IOException;
import java.util.ArrayList;

public class KATA5V2017V1 {

    public static void main(String[] args) throws IOException {
        String nameFile = "/Users/ejrbalma/Google Drive/Curso 2017 2018/ISII/KATA/Data/emailsfile.txt";
        ArrayList <String> arrayMail = MailList.readFile(nameFile);
        Histogram<String> histogram = MailHistogramBuilder.build(arrayMail);
        new HistogramDisplay(histogram).execute();

        
    }
    
}
