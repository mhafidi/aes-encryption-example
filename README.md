
# AES-128 Encryption Example

This project demonstrates AES-128 encryption in Java using the Java Cryptography Architecture (JCA). It allows you to encrypt a hexadecimal value with a given hexadecimal key.

## Prerequisites

- Java Development Kit (JDK) 8 or higher installed.
- Apache Maven installed (for building the project).

## Getting Started

1. Clone this repository to your local machine:

   ```shell
   git clone https://github.com/mhafidi/aes-encryption-example.git
   ```

2. Navigate to the project directory:

   ```shell
   cd aes-encryption-example
   ```

3. Update the `encrypt.sh` script with execute permissions:

   ```shell
   chmod +x encrypt.sh
   ```

4. Ensure you have set the appropriate hexadecimal key (`hexKey`) and value (`hexValueToEncrypt`) in the `encrypt.sh` script.

## Building the Project

To build the project and create an executable JAR file, run the following command:

```shell
./encrypt.sh
```

This will compile the Java code, package it into a fat JAR, and create a JAR file named `target/aes-encryption-example-1.0-SNAPSHOT.jar`.

## Running the AES-128 Encryption

After building the project, you can use the `encrypt.sh` script to run the AES-128 encryption with your hexadecimal key and value:

```shell
./encrypt.sh <hexKey> <hexValueToEncrypt>
```

Replace `<hexKey>` and `<hexValueToEncrypt>` with your hexadecimal key and value. For example:

```shell
./encrypt.sh 00112233445566778899AABBCCDDEEFF 112233445566778899AABBCCDDEEFF00
```

The script will execute the JAR file and display the encrypted result.

## Customization

- You can customize the encryption mode and padding by modifying the Java code in `AES128Encryption.java` based on your requirements.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.
