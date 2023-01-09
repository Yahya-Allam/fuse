FROM openjdk:8-jre

ENV ACTIVEMQ_VERSION 5.15.6
ENV ACTIVEMQ apache-activemq-$ACTIVEMQ_VERSION
ENV ACTIVEMQ_TCP=61616 ACTIVEMQ_AMQP=5672 ACTIVEMQ_STOMP=61613 ACTIVEMQ_MQTT=1883 ACTIVEMQ_WS=61614 ACTIVEMQ_UI=8161
ENV ACTIVEMQ_HOME /opt/activemq

RUN wget -O $ACTIVEMQ-bin.tar.gz https://archive.apache.org/dist/activemq/$ACTIVEMQ_VERSION/$ACTIVEMQ-bin.tar.gz

WORKDIR /opt

RUN tar xzf $ACTIVEMQ-bin.tar.gz -C  /opt

RUN chgrp -R 0 /opt && \
    chmod -R g=u /opt

EXPOSE $ACTIVEMQ_TCP $ACTIVEMQ_AMQP $ACTIVEMQ_STOMP $ACTIVEMQ_MQTT $ACTIVEMQ_WS $ACTIVEMQ_UI

CMD ["/bin/sh", "-c", "echo 'Openshift Compliant ApacheMQ Image'; pwd; ls -al; cd apache-activemq-5.15.6/bin; ls -al; ./activemq console"]
