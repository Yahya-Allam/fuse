FROM openjdk:8-jre-alpine
RUN wget -O activemq.tar.gz http://archive.apache.org/dist/activemq/5.15.6/apache-activemq-5.15.6-bin.tar.gz 
RUN tar -xzf activemq.tar.gz 
CMD ["apache-activemq-5.15.6/bin/activemq", "console"]