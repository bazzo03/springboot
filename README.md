# Readme File

### Objective of the application

The application is a prototype using SpringBoot and its components. 


### Run the application

The application is built as a SpringBoot application and uses Maven.

Deploy the application with Maven Install setting in goals:
```bash
spring-boot:run
```  

### Technologies Used

Technology	|	Version
----------	|	-------
Java		|	1.8
Maven		|	3.5.0
SpringBoot	|	4.1.4

### Customization
The application is deployed on port **8090** with the following instruction in **application.properties** 
`server.port = 8090` 

The application is **secured** with [JWT] (https://jwt.io/), so all the request must be done after successful login.

### Login
For login purposes, please send a **POST** request to #{server}::${port}/login with the following body:
``` 
{
	"username": "admin",
	"password": "password"
}
```

The response has a token in the header and this token must be used for next requests, using *Authorization* header.