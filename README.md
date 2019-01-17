# SpringMySqlIncrement
Spring boot in MVC to connect with MySQL in multithread
Import maven project using pom.xml

# Run application using target/jar file
run below command on command prompt
> java -jar springmysql-0.0.1-SNAPSHOT.jar

and hit localhost:/8080/increment/{id}
or run Jemeter (jmax) file.

# MySQL DB
CREATE TABLE 'counter' (
	'id' int(11) NOT NULL,
	'counter' int(11) DEFAULT NULL,
	PRIMARY KEY (`id`)
)


# Applicaltion.properties
spring.datasource.url=jdbc:mysql://localhost:3306/testdb?allowPublicKeyRetrieval=true&useSSL=false
spring.datasource.username=<username>
spring.datasource.password=<password>
spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.MySQL5InnoDBDialect
spring.jpa.hibernate.ddl-auto = update

# SpringBoot main file.
SpringmysqlApplication.java

