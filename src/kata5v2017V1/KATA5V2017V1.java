package kata5v2017V1;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

public class KATA5V2017V1 {

    public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {
        
        ArrayList <String> arrayMail = DataBaseListMail.readDDBB();
        Histogram<String> histogram = MailHistogramBuilder.build(arrayMail);
        new HistogramDisplay(histogram).execute();

        
    }
    
}
