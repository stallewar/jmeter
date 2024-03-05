# JMeter Publish to Glassfish (OpenMQ) Queue

## Description
This documentation provides instructions for publishing messages to a Glassfish (OpenMQ) queue using JMeter.

## Prerequisites
- Glassfish/MQ libraries should be linked to the $CLASSPATH variable or in some other way, but do NOT copy them to `${JMETER_HOME}/libs/ext`
- The local `./asadmin version` should match the remote `./asadmin version`
- In case of the exception "_javax.jms.Message.setJMSDeliveryTime_", copy _jms.jar_ and _imq.jar_ to `$JRE_HOME/lib/ext`
- Fill in the correct values in the Test Plan table

## Usage
1. Fill in the correct values in the Test Plan table
2. Run the test

### Note
- TextMessage "_Simple Text_" should be in the remote `${Q_NAME}`
