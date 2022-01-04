# Scottish Power Java Technical Test - Mid Level

MVP RESTful web service to retrieve SMART meter read details from DB.

## Pre-Reqs
- **Maven** is the build tool used for this project. Installation instructions can be found [here](https://maven.apache.org/install.html).
- Ensure JAVA_HOME environment variable is pointing at a JDK.

## Building
Build via IDE or terminal.
To build via terminal cd to 'tech-test' directory and run 
`mvn clean install `

## Running
Add a spring boot run configuration via IDE or run `mvn spring-boot:run`in the 'tech-test' directory

## Database
H2 in Memory DB. DB UI is available [here](http://localhost:8081/h2-ui/) when the application is running.
- JDBC URL: **jdbc:h2:mem:readsdb**
- DB Username: **kylmcb**
- No Password (Would be required when real data is being used/data is being persisted between application runs)
- Data does not persist between application runs, this would be changed once in a more complete state when there is a desire to persist data between application runs.

## Future Work
Unfortunately, I ran out of time due to unexpected issues trying to enable swagger to help to visualise and interact with the endpoints. 

If not for the time constraints, the development would continue as follows:
- submitMeterRead() method stub in the SmartReadsController class would be implemented by using a .save() method in the AccountRepository, with checks to ensure the data to be entered is not duplicating existing data.
- Automated testing would be used to create an account and hit the "api/smart/reads/{account_id}" endpoint. This would test to ensure the HTTP status is ok (200), the content type is JSON and the JSON content is as expected
