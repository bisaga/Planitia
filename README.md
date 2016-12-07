# Planitia
This is another test project to see how new stuff working together ...

This is a JavaEE application with web interface written with Polymer web components.

#Used development tools:
- Apache Tomee server is used for development
- Netbeans IDE for Java and JavaScript editing and debugging
- Chrome browser with Netbeans connector for debugging support


#Database access library (ActiveRecord)
Add jooq-3.8.6.jar library to project dependency.
http://bisaga.com/blog/programming/jooq-database-access-layer/

#JEE Resources :
http://bisaga.com/blog/programming/tomee-java-ee-server-database-configuration/
Add this resource to server configuration file:  conf/tomee.xml
	<Resource id="jdbc/db" type="javax.sql.DataSource">
		jdbcDriver org.postgresql.Driver
		jdbcUrl jdbc:postgresql://localhost:5432/planitia
		userName postgres
		password postgres
	</Resource>	

#Database driver for Postgres:
Add postgresql-9.4.1212.jar to tomee/lib folder.

#Database migrations with flyway:
http://bisaga.com/blog/programming/flyway-setup-inside-java-project/

#Setup project in netbeans : 
http://bisaga.com/blog/programming/prepare-javaeejavascript-development-environment/


#You can find out more about this project on the blog: 
http://bisaga.com/blog/


#Polymer / Web components 
You need to have npm and bower installed and then you can get all components defined 
in bower.json file with this command:  
$ bower update 

