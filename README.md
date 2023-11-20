# Filter

Resource collections are often enormous, and when some data has to be retrieved from them, it would be only not very efficient to always get the full list and browse it for specific items. Therefore we should design an optimized Search API. 
 
One of the essential features for consuming an API are: 
 
Filtering: to narrow down the query results by specific parameters, eg.Filter logs between the timestamp "2023-09-10T00:00:00Z" and "2023-09-15T23:59:59Z". , creation date, or country



#Overview:
The LogEntity Application is a Java Spring Boot project designed to manage log entities with a web interface. This README provides information on how to run the project, the system design, features implemented, and identified issues.

#How to Run
To run the application, follow these steps:
 1)Clone the repository:

      git clone https://github.com/your-username/log-entity-app.git
2)Open the project in your preferred Java IDE.

3)Configure the database connection in src/main/resources/application.properties.

4)Run the application.

   You can run it directly from your IDE or use the following command: ./mvnw spring-boot:run
5)Access the application in your web browser at http://localhost:3000/index.


#System Design
1)The system follows a typical Spring Boot application structure:

2)Entity Layer (dyte.demo.dyte.Entity): Defines the LogEntity class representing the log data structure.

3)Repository Layer (dyte.demo.dyte.Repository): Implements the LogRepository interface, extending JpaRepository for database interaction.

4)Service Layer (dyte.demo.dyte.Service): Contains the LogService interface and its implementation, LogServiceImp, handling business logic.

5)Controller Layer (dyte.demo.dyte.Controller): Defines the LogEntityController class, responsible for handling HTTP requests.

6)Thymeleaf Templates (resources/templates): Includes the index.html template for rendering the log list.


#Usage :
Insertion: @PostMapping("/logs") 
Update:@PutMapping("/logs/{id}")
Delete:@DeleteMapping("/{id}")
Filter:@RequestMapping("/index")

To find Filter logs between the timestamp "2023-09-10T00:00:00Z" and "2023-09-15T23:59:59Z". we need enter correctly as per this format "yyyy-MM-dd'T'HH:mm:ssXXX" and you can see in above .

#Features:
1)Offer a user interface (Web UI or CLI) for full-text search across logs.
2)It can filter data as per your respective input keyword.
3)It aims for efficient and quick search results.
4) implements search within specific date ranges.
5) uses regular expressions for searching.
6) allows combining multiple filters.
7) provides real-time log ingestion and searching capabilities.
8) Implements role-based access to the query interface.

# Dependencies
.Spring Boot
.Spring Data JPA
.Thymeleaf
.Bootstrap

#Identified Issues
Security:

1)The application does not currently implement any security features, such as authentication or authorization. Consider adding Spring Security for better security measures.

2)Frontend Styling:

The frontend uses Bootstrap for basic styling. Enhance the UI/UX with a more customized and responsive design.
3)Error Handling:

Implement better error handling mechanisms for improved user experience and debugging.

#Contributors
Yamarthi Sai Kumar

