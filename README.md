# Data-Lock

A browser-based encryption and decryption tool built to demonstrate the fundamentals of classic cryptographic techniques in a simple, interactive interface.

Live demo: https://data-lock-eight.vercel.app

## Overview

Data-Lock lets users encrypt or decrypt text using well-known techniques directly in the browser, with no backend or server-side processing involved. It is intended as an educational tool for anyone curious about how basic ciphers and encodings work.

## Features

- **Two operations**: encrypt or decrypt text.
- **Three techniques**:
  - Caesar Cipher (shift-based substitution, numeric key)
  - XOR Encryption (bitwise XOR with a numeric key)
  - Base64 Encoding (standard encode/decode, no key required)
- **Real-time results**: processing happens instantly in the browser as you submit input.
- **Input validation**: alerts for missing data, non-numeric keys, or invalid Base64 input.
- **No backend required**: runs entirely client-side using HTML, CSS, and JavaScript.

## Usage

1. Open `index.html` in any modern web browser.
2. Choose an operation: **Encrypt** or **Decrypt**.
3. Choose a technique: **Caesar Cipher**, **XOR Encryption**, or **Base64 Encoding**.
4. Enter the text to process in the **Enter Data** field.
5. For Caesar Cipher or XOR, enter a numeric key in the **Enter Key** field (Base64 does not require a key).
6. Click **Submit** to view the result.

## Project Structure

```
.
├── index.html                          # Main web application (HTML, CSS, JavaScript)
├── java webpage.java                   # Standalone Java implementation of the same ciphers
├── Project End-Term Report Format.docx # Project report document
└── README.md
```

## Techniques Implemented

| Technique      | Type              | Key Required   |
|----------------|-------------------|-----------------|
| Caesar Cipher  | Substitution      | Numeric shift   |
| XOR Encryption | Bitwise operation | Numeric key     |
| Base64 Encoding| Encoding scheme   | None            |

Note: These techniques are for educational purposes only and are not suitable for securing sensitive or real-world data. Caesar Cipher and XOR with a small numeric key are trivially breakable, and Base64 is an encoding, not encryption.

## Running the Java Version

The repository also includes a standalone Java console implementation (`java webpage.java`) covering the same three techniques.

```
javac "java webpage.java"
java EncryptionDecryption
```

## Purpose

This project serves as a hands-on introduction to cryptography fundamentals for students, educators, and anyone curious about how basic encryption and encoding techniques work under the hood.

## License

No license has been specified for this project.
