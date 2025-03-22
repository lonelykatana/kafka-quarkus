# ifg-kafka

This project uses Quarkus, the Supersonic Subatomic Java Framework and Kafka

## Running the application
mvn -f producer package  
mvn -f processor package  
docker-compose up

## To try
POST http://localhost:8080/employee/create   
{
    "name":"Franz",
    "level":"C",
    "sales":4,
    "salary":12345678
}
