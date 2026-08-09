# Student Management - Spring Boot

Java 21 + Spring Boot REST API with JPA and H2. CRUD endpoints are ready for local use and Docker/EC2 deployment.

## Run
mvn clean package
java -jar target/student-management-0.0.1-SNAPSHOT.jar

API: http://localhost:8080/api/students
H2 console: http://localhost:8080/h2-console
JDBC URL: jdbc:h2:file:./data/studentdb
User: sa
Password: empty

## Endpoints
GET /api/students
GET /api/students/{id}
POST /api/students
PUT /api/students/{id}
DELETE /api/students/{id}

## Docker
mvn clean package
docker build -t student-management .
docker run -p 8080:8080 student-management

## AWS EC2
Launch Ubuntu EC2, allow TCP 22 and 8080 in the security group, install Java 21 + Maven, copy the project, run mvn clean package, then java -jar target/student-management-0.0.1-SNAPSHOT.jar. For production, put a reverse proxy/HTTPS in front and use Amazon RDS instead of H2.
