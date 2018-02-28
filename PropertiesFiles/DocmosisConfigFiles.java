
import java.io.File;

import com.docmosis.SystemManager;
import com.docmosis.document.DocumentProcessor;
import com.docmosis.template.population.DataProviderBuilder;

/**
 * A simple example showing Docmosis creating a PDF with dynamic data from a DOC
 * template.
 */
public class DocmosisConfigFiles {
	public static void main(String[] args) {

		// Use the DataProviderBuilder to build the data provider from Strings
		DataProviderBuilder dpb = new DataProviderBuilder();

		dpb.add("date", "12 Jun 2016");
		dpb.add("message", "This Docmosis Document Engine is working!");

		try {
			// Initialize the system using the "docmosis.properties" file
			SystemManager.initialise();

			File templateFile = new File("WelcomeTemplate.doc");
			File outputFile = new File("newDocument.pdf");

			if (!templateFile.canRead()) {
				System.err.println("\nCannot find '" + templateFile + "' in: " + new File("").getCanonicalPath());
			} else {

				// Create the document
				DocumentProcessor.renderDoc(templateFile, outputFile, dpb.getDataProvider());

				System.out.println("\nCreated: " + outputFile.getCanonicalPath());
			}
		} catch (Exception e) {
			System.err.println("\nPlease check the following: " + e.getMessage());
		} finally {

			// Shutdown the system
			SystemManager.release();
		}
	}
}
