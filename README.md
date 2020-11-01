# Java JDK 11 and Fx13 Non-modular


## Non-modular - Maven

`java-11-fx-non-modular` sample non-modular project to run with Maven

### Linux / Mac

If you run on Linux or Mac, follow these steps:

    cd to the folder java-11-fx-non-modular
    
To run the project:
    
    ./mvnw clean javafx:run

To create a fat jar:

    ./mvnw clean compile package
    java -jar shade/java-11-fx-non-modular.jar


### Windows

If you run on Windows, follow these steps:

    cd to the folder java-11-fx-non-modular

To run the project:
    
    mvnw compile exec:java

To create a fat jar:

    mvnw clean compile package
    java -jar shade\hellofx.jar
    
    
## Install git for Windows    

Install git for Windows:

[https://git-scm.com/download/win](https://git-scm.com/download/win)


## Import Maven Project in Eclipse

Navigate to Import->Maven->Check out Maven project from scm

If there is no git connector available... please install it

Help->Install new Software. Copy the following link in field work:

https://repo1.maven.org/maven2/.m2e/connectors/m2eclipse-egit/0.15.1/N/0.15.1.201806191431/    


