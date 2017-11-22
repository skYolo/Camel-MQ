package com.egiants.activemq.activemqcamel.jms;

import org.apache.camel.builder.RouteBuilder;

public class JmsReadRoute extends RouteBuilder {

    public void configure() throws Exception {

        from("activemq:queue:Camel&ActiveMQ")
                .to("log:?level=INFO&showBody=true")
                .to("direct:readQueue");


    }



}
