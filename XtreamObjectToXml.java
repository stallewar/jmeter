package com.temafon.tqa.utils.converter;

import com.temafon.data.MORequest;
import com.temafon.data.MTRequest;
import com.thoughtworks.xstream.XStream;
import org.testng.annotations.Test;

@Test
public class XtreamObjectToXml {

  private XStream xstream = new XStream();
  private MTRequest mtRequest = new MTRequest(71111111111L, "shortNumber", "text", "serviceName");
  private MORequest moRequest =
      new MORequest(71111111111L, "orderingChannel", "shortNumber", "text", 1L);

  public void getXstream() {
    // xstream.alias("mtRequest", MTRequest.class);
    String mtRequestXml = xstream.toXML(mtRequest);
    String moRequestXml = xstream.toXML(moRequest);
    System.out.println("RESULT mtRequest to Xml = " + mtRequestXml);
    System.out.println("RESULT moRequest to Xml = " + moRequestXml);
  }
}
