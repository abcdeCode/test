# test
mvn clean package -Dmaven.test.skip=true 

java -javaagent:*/jacocoagent.jar=includes=com.*,output=tcpserver,port=10000,address=* -jar demo-0.0.1-SNAPSHOT.jar

http://localhost:8081/pro/test4?page=1&size=7
