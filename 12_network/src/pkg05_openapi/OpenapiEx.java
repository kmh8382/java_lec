package pkg05_openapi;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.XML;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class OpenapiEx {

  public static void a() throws Exception {
    
    String serviceKey = "FzHBdrlE576Tu8T7P111HAACaxaJL4BzCfbnTaZ6SaXYmeWxFjJfrpzyjqZ2BdsbS1QVz5ey9TQDW0DWrFBzyA%3D%3D";
    
    StringBuilder builder = new StringBuilder();
    builder.append("http://apis.data.go.kr/1360000/VilageFcstInfoService_2.0/getVilageFcst");
    builder.append("?serviceKey=").append(serviceKey);
    builder.append("&pageNo=").append(1);
    builder.append("&numOfRows=").append(1000);
    builder.append("&base_date=").append(20241118);
    builder.append("&base_time=").append(0600);
    builder.append("&nx=").append(61);
    builder.append("&ny=").append(125);
    

    URL url = new URL(builder.toString());
    HttpURLConnection conn = (HttpURLConnection) url.openConnection();
    
    BufferedReader in = null;
    if(conn.getResponseCode() == HttpURLConnection.HTTP_OK) {
      in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
    } else {
      in = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
    }
    
    StringBuilder responseBody = new StringBuilder();
    String line = null;
    while ((line = in.readLine()) != null)
      responseBody.append(line);
    
    System.out.println(responseBody.toString());
    
    in.close();
    conn.disconnect();
    
//    // XML -> JSONObject
//    org.json.JSONObject obj =  org.json.XML.toJSONObject(responseBody.toString());
//    System.out.println(obj);

  }
  
  public static void b() throws Exception {
  
    String serviceKey = "FzHBdrlE576Tu8T7P111HAACaxaJL4BzCfbnTaZ6SaXYmeWxFjJfrpzyjqZ2BdsbS1QVz5ey9TQDW0DWrFBzyA%3D%3D";
    
    StringBuilder builder = new StringBuilder();
    builder.append("http://apis.data.go.kr/1360000/VilageFcstInfoService_2.0/getVilageFcst");
    builder.append("?serviceKey=").append(serviceKey);
    builder.append("&pageNo=").append(1);
    builder.append("&numOfRows=").append(1000);
    builder.append("&base_date=").append(20241118);
    builder.append("&base_time=").append(0600);
    builder.append("&nx=").append(61);
    builder.append("&ny=").append(125);

    DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
    DocumentBuilder docBuilder = builderFactory.newDocumentBuilder();
    Document doc = docBuilder.parse(builder.toString());
    
    doc.getDocumentElement().normalize();
    System.out.println("Root tag : " + doc.getDocumentElement().getNodeName());
    
    NodeList nodeList = doc.getElementsByTagName("item");   // <item> 태그 모두 가져오기
    System.out.println("노드 갯수 : " + nodeList.getLength());
    
    System.out.println(nodeList.item(0).getNodeName());
    System.out.println(nodeList.item(1).getChildNodes().getLength());
    
    for(int i = 0, length = nodeList.getLength(); i < length; i++) {
      Node node = nodeList.item(i);      
      System.out.println(((Element)node).getElementsByTagName("baseDate").item(0).getTextContent());
      System.out.println(((Element)node).getElementsByTagName("baseTime").item(0).getTextContent());
      System.out.println(((Element)node).getElementsByTagName("category").item(0).getTextContent());
      System.out.println(((Element)node).getElementsByTagName("fcstDate").item(0).getTextContent());
      System.out.println(((Element)node).getElementsByTagName("fcstTime").item(0).getTextContent());
      System.out.println(((Element)node).getElementsByTagName("fcstValue").item(0).getTextContent());
      System.out.println(((Element)node).getElementsByTagName("nx").item(0).getTextContent());
      System.out.println(((Element)node).getElementsByTagName("ny").item(0).getTextContent());
      System.out.println("----------");
      
    }
  }
  
  public static void c() throws Exception {
    
//    // JSONObject 사용법
//    JSONObject obj =  new JSONObject("{\"name\": \"kim\", \"age\": 30}");
//    System.out.println(obj.getString("name"));
//    System.out.println(obj.getInt("age"));

    String serviceKey = "FzHBdrlE576Tu8T7P111HAACaxaJL4BzCfbnTaZ6SaXYmeWxFjJfrpzyjqZ2BdsbS1QVz5ey9TQDW0DWrFBzyA%3D%3D";
    
    StringBuilder builder = new StringBuilder();
    builder.append("http://apis.data.go.kr/1360000/VilageFcstInfoService_2.0/getVilageFcst");
    builder.append("?serviceKey=").append(serviceKey);
    builder.append("&pageNo=").append(1);
    builder.append("&numOfRows=").append(1000);
    builder.append("&base_date=").append(20241118);
    builder.append("&base_time=").append(0600);
    builder.append("&nx=").append(61);
    builder.append("&ny=").append(125);
    builder.append("&dataType=").append("JSON");
    

    URL url = new URL(builder.toString());
    HttpURLConnection conn = (HttpURLConnection) url.openConnection();
    
    BufferedReader in = null;
    if(conn.getResponseCode() == HttpURLConnection.HTTP_OK) {
      in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
    } else {
      in = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
    }
    
    StringBuilder responseBody = new StringBuilder();
    String line = null;
    while ((line = in.readLine()) != null)
      responseBody.append(line);
    
    // System.out.println(responseBody.toString());
    
    in.close();
    conn.disconnect();
    
    JSONArray item = new JSONObject(responseBody.toString())
                          .getJSONObject("response")
                          .getJSONObject("body")
                          .getJSONObject("items")
                          .getJSONArray("item");
    // System.out.println(item.length());
    // System.out.println(item.getJSONObject(0).getString("category"));
    
    for(int i = 0, length = item.length(); i < length; i++) {
      System.out.println(item.getJSONObject(i).getString("baseDate"));
      System.out.println(item.getJSONObject(i).getString("baseTime"));
      System.out.println(item.getJSONObject(i).getString("category"));
      System.out.println(item.getJSONObject(i).getString("fcstDate"));
      System.out.println(item.getJSONObject(i).getString("fcstTime"));
      System.out.println(item.getJSONObject(i).getString("fcstValue"));
      System.out.println(item.getJSONObject(i).getInt("nx"));
      System.out.println(item.getJSONObject(i).getInt("ny"));
      System.out.println("----------");
    }
        
  }
  
  public static void d() throws Exception {
    
    // 기상청 RSS (XML 받아서 Document 이용해서 파싱하기)
    
    String apiURL = "http://www.kma.go.kr/wid/queryDFSRSS.jsp?zone=1168066000";
    
    Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(apiURL);
    doc.getDocumentElement().normalize();
    System.out.println("Root tag : " + doc.getDocumentElement().getNodeName());

    NodeList nodeList = doc.getElementsByTagName("data");
    System.out.println("노드 갯수 : " + nodeList.getLength());
    
//    System.out.println(nodeList.item(0).getNodeName());
//    System.out.println(nodeList.item(1).getChildNodes().getLength());

    for(int i = 0, length = nodeList.getLength(); i < length; i++) {
      Node node = nodeList.item(i);      
      System.out.println(((Element)node).getElementsByTagName("hour").item(0).getTextContent());
      System.out.println(((Element)node).getElementsByTagName("day").item(0).getTextContent());
      System.out.println(((Element)node).getElementsByTagName("temp").item(0).getTextContent());
      System.out.println(((Element)node).getElementsByTagName("tmx").item(0).getTextContent());
      System.out.println(((Element)node).getElementsByTagName("tmn").item(0).getTextContent());
      System.out.println(((Element)node).getElementsByTagName("sky").item(0).getTextContent());
      System.out.println(((Element)node).getElementsByTagName("pty").item(0).getTextContent());
      System.out.println(((Element)node).getElementsByTagName("wfKor").item(0).getTextContent());
      System.out.println(((Element)node).getElementsByTagName("wfEn").item(0).getTextContent());
      System.out.println(((Element)node).getElementsByTagName("pop").item(0).getTextContent());
      System.out.println(((Element)node).getElementsByTagName("r12").item(0).getTextContent());
      System.out.println(((Element)node).getElementsByTagName("s12").item(0).getTextContent());
      System.out.println(((Element)node).getElementsByTagName("ws").item(0).getTextContent());
      System.out.println(((Element)node).getElementsByTagName("wd").item(0).getTextContent());
      System.out.println(((Element)node).getElementsByTagName("wdKor").item(0).getTextContent());
      System.out.println(((Element)node).getElementsByTagName("wdEn").item(0).getTextContent());
      System.out.println(((Element)node).getElementsByTagName("reh").item(0).getTextContent());
      System.out.println(((Element)node).getElementsByTagName("r06").item(0).getTextContent());
      System.out.println(((Element)node).getElementsByTagName("s06").item(0).getTextContent());
      System.out.println("----------");      
    }    
    
  }
  
  public static void e() throws Exception {
    
    // 기상청 RSS (XML 받아서 JSONObject 로 바뀐 뒤 파싱하기)
    
    String apiURL = "http://www.kma.go.kr/wid/queryDFSRSS.jsp?zone=1168066000";
    
    URL url = new URL(apiURL);
    HttpURLConnection conn = (HttpURLConnection)url.openConnection();
    BufferedReader in = null;
    if(conn.getResponseCode() == HttpURLConnection.HTTP_OK) {
      in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
    } else {
      in = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
    }    
    
    StringBuilder builder = new StringBuilder();
    String line = null;
    while ((line = in.readLine()) != null)
      builder.append(line);
    
     // System.out.println(builder);
    
     // JSONObject obj =  XML.toJSONObject(builder.toString());
     // System.out.println(obj);

     JSONArray data = XML.toJSONObject(builder.toString())
         .getJSONObject("rss")
         .getJSONObject("channel")
         .getJSONObject("item")
         .getJSONObject("description")
         .getJSONObject("body")
         .getJSONArray("data");
         
     for(int i = 0, length = data.length(); i < length; i++) {
       JSONObject obj = data.getJSONObject(i);
       System.out.println(obj.getInt("hour"));
       System.out.println(obj.getInt("day"));
       System.out.println(obj.getInt("temp"));
       System.out.println(obj.getInt("tmx"));
       System.out.println(obj.getInt("tmn"));
       System.out.println(obj.getString("wfKor"));
       System.out.println("----------");   
       
     }
     
  }
  public static void main(String[] args) throws Exception {
    
    // a();
    // b();
    // c();
    // d();
    e();
    
  }

}
