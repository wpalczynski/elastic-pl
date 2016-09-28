#!/bin/sh

dir=../../../dist

if [[ ! -e $dir ]]; then
    mkdir $dir
elif [[ ! -d $dir ]]; then
    echo "$dir already exists but is not a directory" 1>&2
fi

java -cp ../../../bin/javacc.jar jjtree ElasticPL.jjt; java -cp ../../../bin/javacc.jar javacc ElasticPL.jj
cp JJTElasticPLParserState.recovery JJTElasticPLParserState.java

javac -cp "../../../lib/*" -d "../../../" *.java ../../../TestCompiler.java
cd ../../../dist
pwd
jar cvfm ElasticPL.jar ../Manifest ../elastic/pl/interpreter/*.class ../TestCompiler.class
cd ..
cp dist/ElasticPL.jar .

java -jar ElasticPL.jar fuck.spl 
