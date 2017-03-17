package com.kyle.learn.pattern.factory.simple.demo2;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: Kyle
 * Date: 2017-01-11:15:08
 */
public class XMLUtil {
    private static final String XML_FILE_NAME = "E:/ProjectPackage/myself/java/pattern/src/main/java/com/hubq/learn/pattern/factory/simple/demo2/file.xml";
    private static final String BASE_SHAPE_NAME = "shape";
    private static Map<String, String> beanMap = new HashMap<String,String>();

    private static void init() throws Exception {
        DocumentBuilderFactory document = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = document.newDocumentBuilder();
        Document doc = (Document) builder.parse(new File(XML_FILE_NAME));

        NodeList nodeList = doc.getElementsByTagName(BASE_SHAPE_NAME);

        for (int i = 0; i < nodeList.getLength(); i++) {
            NodeList childLists = nodeList.item(i).getChildNodes();
            String name = null;
            String clzz = null;
            for(int j = 0;j<childLists.getLength();j++){
                Node node = childLists.item(j);
                if(node.getNodeType() == Node.ELEMENT_NODE){
                    if("name".equals(node.getNodeName())){
                        name = node.getFirstChild().getNodeValue();
                    }else if("class".equals(node.getNodeName())){
                        clzz = node.getFirstChild().getNodeValue();
                    }
                }
            }

            beanMap.put(name, clzz);
        }
    }

    public static String getBeans(String name) throws Exception {
        if (beanMap == null || beanMap.entrySet().size() == 0) {
            init();
        }

        return beanMap.get(name);
    }
}
