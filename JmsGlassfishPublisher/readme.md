Descripton:
Way connect Jmeter to Glassfish(openmq) broker. 

PRE:
1. Glassfish lib's should be linked as $СLASSPATH variable or linked somehow. Do NOT  copy them to ${JMETER_HOME/libs/ext}
2. Local "/glassfish/bin/asadmin" version = Remote "asadmin version"
3. In case of exception "javax.jms.Message.setJMSDeliveryTime" - copy jms.jar, imq.jar to $JRE_HOME/lib/ext/..
5. Fill in correct values in Test Plan variables table
6. Run... 

TextMessage - "Simple Text" should be in remote ${Q_NAME}
