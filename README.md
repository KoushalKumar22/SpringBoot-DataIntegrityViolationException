# SpringBoot-DataIntegrityViolationException

This project is a Spring Boot CRUD application for managing a `Customers` profiles. It includes basic CRUD operations with validation exception, DataIntegrityViolationException and global exception handling.

## Features

- Add new Customer
- List all Customers profiles
- Validation of new Customers entry
- Phone No Validation for unique and Indian Number Only
- exception's handling
- Global exception handler for validation errors

## Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- Hibernate
- postgreSQL (can be replaced with any other database)
- Spring Validation

## Getting Started

### Prerequisites

- Java 8 or higher
- Maven 3.6 or higher

### Installation

1. Clone the repository:
   ```sh
   https://github.com/KoushalKumar22/SpringBoot-DataIntegrityViolationException.git
   cd SpringBoot-DataIntegrityViolationException
2. Build the project:
   ```sh
     mvn clean install
3. Run the application:
   ```sh
     mvn spring-boot:run
The application will start on http://localhost:8080.

### Endpoints

1. Test Endpoint
- URL: `/test`

- Method: GET

- Description: Test the API to ensure it's running

- Response: "This Is A Test Run"

2. Save DATA
- URL: `/save`
- Method: POST
- Description: Save a new customer data record to the database
- Request Body: json in postman
  ```sh
    {
    "name": "Ramesh",
    "phoneno": 9876543210
    }

3. Get All Users
- URL: `/all`
- Method: GET
- Description: Returns a list of all Customers profiles.
  
4. Validation
- name: Must not be empty, and must be at least 4 characters long, should not contain any special characters.
- phone no must start form no between 6 to 9(as per Indian Phone no) and must be of 10 digits and must be unique.

### Exception Handling

The application includes a global exception handler that captures `MethodArgumentNotValid` and returns a meaningful error response.
- example error response
  ```sh
   {
  "name": "Name cannot be empty",
  "name": "Name should not contain special characters",
  "phoneno": "phone no cannot be empty",
  "phoneno": "phone no already registered",
  }
### Project Structure

- `Customer`: Entity class representing a Customer profile.
- `CustomerRepository`: Repository interface for CRUD operations on user profiles.
- `IdNotFoundException`: Exception handleing for no data found as per entered id.
- `GlobalExceptionHandler`: Global exception handler for validation errors.
- `CustomerController`: REST controller for handling Customer-related requests.

## Acknowledgements

I would like to thank the following resources and individuals who made this project possible:

- [Spring Boot](https://spring.io/projects/spring-boot)
- [Spring Data JPA](https://spring.io/projects/spring-data-jpa)
- [Hibernate](http://hibernate.org/)
- [Spring Validation](https://docs.spring.io/spring-framework/docs/current/reference/html/core.html#validation)
- [JetBrains](https://www.jetbrains.com/idea/)
- [Stack Overflow](https://stackoverflow.com/)
