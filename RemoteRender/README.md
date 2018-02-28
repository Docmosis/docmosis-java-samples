# Remote Render Example

Welcome to Docmosis, we hope you find it useful.

Please contact [support@docmosis.com](support@docmosis.com) at any
time if you need help.

This sample contains:

 * RemoteRender.java
 * WelcomeTemplate.doc
 * runConverter.sh
 * runConverter.bat
 * docmosis.properties
 * README.md (this file)

## Getting Started

**1. Start a Free Trial to receive a License Key via email**

Visit: https://www.docmosis.com/try/docmosis-java.html

The key will look like this:

    docmosis.key=1234-5678-90AB-CDEF-GHIJ-KLMN-OPQR-STUV-WXYZ-1-2345
    docmosis.site=Free Trial License

You should add the key in to the RemoteRender.java code by updating
this line:

```java
String key = new String("XXXX-XXXX-XXXX-XXXX-XXXX-XXXX-XXXX-XXXX-XXXX-X-XXXX");
```

**2. Download the latest Docmosis-Java Software**

Visit: https://www.docmosis.com/resources/docmosis-java.html

Download the Docmosis-Java [ZIP] to get the latest Software and
Documentation.

Add the jars from the ZIP to your Java project.  The essential jar is
the docmosis.jar (eg: docmosis4.0.3.jar).


**3. Install OpenOffice or LibreOffice**

You should download and install a version of OpenOffice or
LibreOffice.

On Windows the install directory could look like this...

    C:/Program Files/LibreOffice 5
    C:/Program Files (x86)/OpenOffice 4

On Linux the install directory could look like this...

    /opt/OpenOffice4
    /opt/libreoffice5.0

You should set the install location in the docmosis.properties file by
replacing:

    docmosis.openoffice.location=XXXXXXXXXXXXXXXXXXXXXXXXXXXXX


**4. Copy the WelcomeTemplate.doc to the "current" directory**

This sample code looks for the template in the "current" directory
from where the code is run.

If you are running in an IDE, that directory is often the root
directory for your project.

If you run the sample code it will tell you where it is looking for
the WelcomeTemplate.doc file, if it can't find it.
 

**5. Setup a Remote Converter**

You can run a remote converter using the runConverter scripts
provided.

A remote converter can isolate your application from
OpenOffice/LibreOffice dependencies as well as allow for load
distribution.
 
The runConverter script needs the docmosis.jar and the
docmosis.properties file in the same directory as the script.

  * Copy docmosis.jar (eg: docmosis4.0.3.jar) to the same directory as
    the script.

  * Copy docmosis.properties to the same directory as the script.


Edit the runConverter script to make sure you are using the correct
version of Java.
 
The version of Java you choose should match the install of
OpenOffice/LibreOffice as follows:

  * If you installed a 32Bit OpenOffice/LibreOffice - then you should
    use a 32Bit version of Java.

  * If you installed a 64Bit OpenOffice/LibreOffice - then you should
    use a 64Bit version of Java.


**6. Start the Remote Converter**

When the runConverter script launches successfully, it will report
that the converter is running and listening on port 2100.

You can use any port.  If you would like to use a different port, you
will need to update both the runConverter script and the
RemoteRender.java code.


**7. Create your document**

If you have set up the above steps correctly, when you run
RemoteRender.java it will connect to the remote converter and generate
a PDF file based on the WelcomeTemplate.doc.


**8. Next Steps**

Try running the remote converter on a different computer on your
network.

You will find more code samples and document examples on our website.


## Troubleshooting

Please contact [support@docmosis.com](support@docmosis.com) at any
time if you need help getting your environment set up correctly.



Hope you have fun.

The Docmosis Team.