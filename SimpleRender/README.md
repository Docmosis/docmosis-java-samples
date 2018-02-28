# Simple Render Example

Welcome to Docmosis, we hope you find it useful.

Please contact [support@docmosis.com](mailto:support@docmosis.com) at
any time if you need help.

This sample contains:

 * SimpleRender.java
 * WelcomeTemplate.doc
 * README.md (this file)


## Getting Started

### 1. Start a Free Trial to receive a License Key via email

Visit: https://www.docmosis.com/try/docmosis-java.html

The key will look like this:

    docmosis.key=1234-5678-90AB-CDEF-GHIJ-KLMN-OPQR-STUV-WXYZ-1-2345
    docmosis.site=Free Trial License

You should add the key to the SimpleRender.java code by updating this
line:

```java
String key = new String("XXXX-XXXX-XXXX-XXXX-XXXX-XXXX-XXXX-XXXX-XXXX-X-XXXX");
```


### 2. Download the latest Docmosis-Java Software

Visit: https://www.docmosis.com/resources/docmosis-java.html

Download the Docmosis-Java [ZIP] to get the latest Software and
Documentation.

Add the jars from the ZIP to your Java project.  The essential jar is
the docmosis.jar (eg: docmosis4.0.3.jar).


### 3. Install OpenOffice or LibreOffice

You should download and install a version of OpenOffice or LibreOffice.

On Windows the install directory could look like this...

    C:/Program Files/LibreOffice 5
    C:/Program Files (x86)/OpenOffice 4

On Linux the install directory could look like this...

    /opt/OpenOffice4
    /opt/libreoffice5.0

You should update the directory name in the SimpleRender.java code here:

```java
String officePath = new String("C:/Program Files/LibreOffice 5");
```


### 4. Copy the WelcomeTemplate.doc to the "current" directory

This sample code looks for the template in the "current" directory
from where the code is run.

If you are running in an IDE, that directory is often the root
directory for your project.

If you run the sample code it will tell you where it is looking for
the WelcomeTemplate.doc file, if it can't find it.


### 5. Create your first PDF

If you have set up the above four steps correctly, SimpleRender.java
will generate a PDF file based on the WelcomeTemplate.doc.


### 6. Next Steps

Try modifying the template or the data to see the effect.

You will find more code samples and document examples on our website.


## Troubleshooting

Please contact [support@docmosis.com](mailto:support@docmosis.com) at
any time if you need help getting your environment set up correctly.


## 32 bit vs 64 bit

If you installed a 32 bit version of OpenOffice or LibreOffice then
you will need a 32 bit version of Java to use Docmosis.

If you installed a 64 bit version of OpenOffice or LibreOffice then
you will need a 64 bit version of Java to use Docmosis.

If you are building a 64 bit application, but you can only find a 32
bit version of OpenOffice or LibreOffice for your platform - then you
should try the [Remote Render](../RemoteRender) example.

That example explains how Docmosis can run in two parts: Core and
Converter.

The Core is Docmosis embedded in your application. The Converter is a
separate Docmosis process that leverages the OpenOffice/LibreOffice
install. The converters can be run separately from your main
application and resolves the 32 bit/64 bit mismatch.




Hope you have fun.

The Docmosis Team.
