#!/bin/bash

# Compile Main.java
javac Main.java

# Run Main.java with input.txt if exists
if [ -f input.txt ]; then
    java Main < input.txt
else
    java Main
fi