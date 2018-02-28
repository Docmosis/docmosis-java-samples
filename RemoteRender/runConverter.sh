#!/bin/sh

# Set CLASSPATH to include docmosis*jar and also current directory so
# RemoteConverter can find the docmosis.properties file there.
CLASSPATH=.
for jars in docmosis?.?.?.jar
do
export CLASSPATH=$jars:$CLASSPATH
done
echo CLASSPATH=$CLASSPATH
echo


# Select the 32Bit or 64Bit version of Java that you want to use.
# It should match the 32Bit/64Bit install you have of OpenOffice/LibreOffice.
echo Using this version of Java:
java -version
echo


echo Starting converter on port 2100
echo
java com.docmosis.document.converter.RemoteConverter 2100

