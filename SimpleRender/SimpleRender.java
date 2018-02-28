import java.io.File;

import com.docmosis.SystemManager;
import com.docmosis.document.DocumentProcessor;
import com.docmosis.template.population.DataProviderBuilder;
import com.docmosis.util.Configuration;

/**
 * A simple example showing Docmosis creating a PDF with dynamic data from a
 * DOC template. 
 */
public class SimpleRender
{
    public static void main(String[] args)
    {
        String key = new String("XXXX-XXXX-XXXX-XXXX-XXXX-XXXX-XXXX-XXXX-XXXX-X-XXXX");
        String site = new String("Free Trial License");
        String officePath = new String("C:/Program Files/LibreOffice 5");
        
        if (key.startsWith("XXXX")) {
            System.err.println("\nPlease set your license key");
            System.exit(1);
        }
        if (!new File(officePath).isDirectory() || !new File(officePath).canRead()) {
            System.err.println("\nPlease check \"officePath\" is set to the " +
                               "install dir for OpenOffice or LibreOffice"); 
            System.exit(1);
        }

        // Create the initialisation configuration
        Configuration config = new Configuration(key, site, officePath);

        // Tell Docmosis to use one embedded converter
        config.setConverterPoolConfiguration("1");
        
        // Use the DataProviderBuilder to build the data provider from a String array.
        DataProviderBuilder dpb = new DataProviderBuilder();
		
        dpb.add("date", "28Feb 2018");
        dpb.add("message", "This Docmosis document engine is working!");
  	
    	try {

            // Initialise the system based on configuration
    	    SystemManager.initialise(config);
				
            File templateFile = new File("WelcomeTemplate.doc");
            File outputFile = new File("newDocument.pdf");
			
            if (!templateFile.canRead()) {
                System.err.println("\nCannot find '" + templateFile + "' in: " + new File("").getCanonicalPath());
            } else {

                // Create the document
                DocumentProcessor.renderDoc(templateFile, outputFile, dpb.getDataProvider());

                System.out.println("\nCreated: " + outputFile.getCanonicalPath());
            }
    	} catch (Exception e){
            System.err.println("\nPlease check the following: " + e.getMessage());
        } finally {
            // shutdown the system
            SystemManager.release();
        }
    }
}
