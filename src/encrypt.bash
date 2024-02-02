#!/bin/bash

# Check if both key and value are provided as arguments
if [ "$#" -ne 2 ]; then
  echo "Usage: $0 <hexKey> <hexValueToEncrypt>"
  exit 1
fi

# Assign input arguments to variables
hexKey="$1"
hexValueToEncrypt="$2"

# Build the fat JAR
mvn clean package

# Run the JAR with the provided inputs
java -jar target/aes-encryption-example-1.0-SNAPSHOT.jar "$hexKey" "$hexValueToEncrypt"
