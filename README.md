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
SpringBoot	|   1.5.7
JWT			|	0.8.0	

### Customization
The application is deployed on port **8090** with the following instruction in **application.properties** 
`server.port = 8090` 

The application is **secured** with [JWT](https://jwt.io/), so all the request must be done after successful login.

The application shows all the end-points when requesting to *#{server}::${port}/mappings* - In **application.properties** mappings is set to be shown by `endpoints.mappings.sensitive=false`  

### Login
For login purposes, please send a **POST** request to *#{server}::${port}/login* with the following body:
``` 
{
	"username": "admin",
	"password": "password"
}
```

The response has a token in the header and this token must be used for next requests, using *Authorization* header.