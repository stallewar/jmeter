###### Jmeter JMS - Glassfish(Openmq) 

1. Glassfish/MQ lib's should be linked as $СLASSPATH variable or linked somehow. Do NOT  copy them to `${JMETER_HOME}/libs/ext`
2. Local `./asadmin version` = Remote `./asadmin version`
3. In case of exception "_javax.jms.Message.setJMSDeliveryTime_" - copy _jms.jar_, _imq.jar_ to `$JRE_HOME/lib/ext/`
5. Fill in correct values in Test Plan table
6. Run... 

TextMessage - "_Simple Text_" should be in remote `${Q_NAME}`
