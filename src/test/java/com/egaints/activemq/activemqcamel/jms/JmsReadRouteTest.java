package com.egaints.activemq.activemqcamel.jms;

import com.egiants.activemq.activemqcamel.jms.JmsReadRoute;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.test.junit4.CamelTestSupport;
import org.junit.Test;


public class JmsReadRouteTest extends CamelTestSupport {

    @Override
    protected RouteBuilder createRouteBuilder() throws Exception {
        return new JmsReadRoute();


    }


    @Test
    public void readMessageFromActiveMQ() throws InterruptedException {

        String expected = "456";
        String response = consumer.receiveBody("direct:readQueue", String.class);
        System.out.println("The response is : " + response);
        assertEquals(expected, response);
    }
}
