# Remittance Management System

This repository contains a Java-based implementation of a **Remittance Management System**. The system allows users to perform core banking operations such as remitter registration, beneficiary registration, login, and fund transfers. The application is designed using an MVC (Model-View-Controller) architecture for clean separation of concerns and maintainability.

---

## Features

1. **Remitter Management**  
   - Register a new remitter.  
   - Log in using account credentials.  
   - Retrieve remitter details by account number.

2. **Beneficiary Management**  
   - Register a beneficiary with account details, bank information, and contact details.

3. **Fund Transfer**  
   - Transfer funds between registered remitter and beneficiary accounts.  
   - Maintain transaction history.

---

## Architecture

- **Model Layer**  
  Represents the data structure of `Remitter`, `Beneficiary`, and `FundTransfer`.

- **DAO Layer**  
  Handles database interactions for remitter and beneficiary data persistence.

- **Business Logic Layer**  
  Validates input and coordinates between the data layer (DAO) and the application layer.

- **Application Layer (I/O)**  
  Provides a command-line interface for user interaction.

---

## Database Schema

The application interacts with a MySQL database. Ensure the following tables are set up:

### `remitter_info` Table
| Column           | Data Type  | Description                 |
|------------------|------------|-----------------------------|
| Account_Number   | INT        | Unique remitter account ID  |
| Name             | VARCHAR    | Name of the remitter        |
| Email            | VARCHAR    | Email address               |
| Password         | VARCHAR    | Login password              |
| Balance          | INT        | Account balance             |
| Account_Status   | INT        | Status of the account       |
| IFSC             | VARCHAR    | IFSC code of the bank       |

### `beneficiary_info` Table
| Column           | Data Type  | Description                      |
|------------------|------------|----------------------------------|
| Account_Number   | INT        | Unique beneficiary account ID    |
| Name             | VARCHAR    | Name of the beneficiary          |
| Bank_Name        | VARCHAR    | Bank name                        |
| IFSC             | VARCHAR    | IFSC code of the beneficiary's bank |
| Balance          | INT        | Beneficiary's current balance    |
| Email            | VARCHAR    | Email address of the beneficiary |

### `fund_transfer` Table
| Column            | Data Type  | Description                       |
|-------------------|------------|-----------------------------------|
| Transaction_ID    | INT        | Unique transaction ID             |
| Remitter_Account  | INT        | Sender's account number           |
| Beneficiary_Account| INT       | Receiver's account number         |
| Amount            | INT        | Amount transferred                |
| Status            | VARCHAR    | Status of the transaction         |
| Date              | DATE       | Date of the transaction           |

---

## Future Enhancements

- Add a GUI for better user experience.
- Implement advanced security measures, such as encryption and token-based authentication.
- Support multiple database configurations for scalability.

---
