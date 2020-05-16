"# springboot-kafka" 

This is a simple spring boot demo project. It has one producer and one consumer. String Input is given through the controller which exposes an endpoint.

PreSetup: 1)Need to download the kafka zip folder - https://kafka.apache.org/downloads. 
          2)Start Zookeeeper server - C:\kafka_2.13-2.5.0>bin\windows\zookeeper-server-start.bat config\zookeeper.properties
          3)Start Kafka server - C:\kafka_2.13-2.5.0>bin\windows\kafka-server-start.bat config\server.properties
          4)create a kafka topic. bin\windows\kafka-topics.bat --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --             topic topic-name
