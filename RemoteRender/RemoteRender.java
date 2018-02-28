import java.io.File;

import com.docmosis.SystemManager;
import com.docmosis.document.DocumentProcessor;
import com.docmosis.template.population.DataProviderBuilder;
import com.docmosis.util.Configuration;

/**
 * A simple example showing Docmosis creating a PDF with dynamic data from a DOC
 * template.
 * 
 * This code sample attempts to connect to one remote converter on port 2100.
 * You must start the converter first using the runConverter script. 
 * See: com.docmosis.document.converter.RemoteConverter
 * 
 */
public class RemoteRender {
	public static void main(String[] args) {

		String key = new String("XXXX-XXXX-XXXX-XXXX-XXXX-XXXX-XXXX-XXXX-XXXX-X-XXXX");
		String site = new String("Free Trial License");

		if (key.startsWith("XXXX")) {
			System.err.println("\nPlease set your license key");
			System.exit(1);
		}

		// Create the initialisation configuration
		Configuration config = new Configuration();
		config.setKeyAndSite(key, site);

		// Tell Docmosis to use one remote converter on port 2100 of this local
		// machine.
		config.setConverterPoolConfiguration("localhost:2100");

		// Use the DataProviderBuilder to build the data provider from Strings.
		DataProviderBuilder dpb = new DataProviderBuilder();

		dpb.add("date", "28 Feb 2018");
		dpb.add("message", "This Docmosis Document Engine is working!");

		try {
			// Initialise the system based on configuration
			SystemManager.initialise(config);

			File templateFile = new File("WelcomeTemplate.doc");
			File outputFile = new File("newDocument.pdf");

			if (!templateFile.canRead()) {
				System.err.println("\nCannot find '" + templateFile + "' in: " + new File("").getCanonicalPath());
			} else {

				if (DocumentProcessor.hasOnlineConverters()) {

					// Create the document
					DocumentProcessor.renderDoc(templateFile, outputFile, dpb.getDataProvider());

					System.out.println("\nCreated: " + outputFile.getCanonicalPath());

				} else {
					System.err.println(
							"\nRemote Converter not running.  Have you started the Converter using the runConverter script?");
				}

			}
		} catch (Exception e) {
			System.err.println("\nPlease check the following: " + e.getMessage());
		} finally {
			
			// Shutdown the system
			SystemManager.release();
		}
	}
}
