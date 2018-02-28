@echo off

setlocal


REM Set CLASSPATH to include docmosis*jar and also current directory '.' so 
REM the RemoteConverter can find the docmosis.properties file there.

for /f %%X in ('dir /b docmosis?.?.?.jar') do call set jars=%%X;%%jars%%
set CLASSPATH=.;%jars%
echo CLASSPATH=%CLASSPATH%
echo.


REM Select the 32Bit or 64Bit version of Java that you want to use.
REM It should match the 32Bit/64Bit install you have of OpenOffice/LibreOffice.

REM 64BIT EXAMPLE >>> set JAVA=C:\Program Files\Java\jre1.8.0_51\bin\java
REM 32BIT EXAMPLE >>> set JAVA=C:\Program Files (x86)\Java\jre1.8.0_25\bin\java

set JAVA=java

echo Using this version of Java:
"%JAVA%" -version
echo.

echo Starting converter on port 2100
echo.

"%JAVA%" com.docmosis.document.converter.RemoteConverter 2100


pause