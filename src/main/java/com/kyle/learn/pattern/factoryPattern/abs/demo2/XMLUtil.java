package com.kyle.learn.pattern.factoryPattern.abs.demo2;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: Kyle
 * Date: 2017-01-19:11:40
 */
public class XMLUtil {
    private static final Map<String, String> map = new HashMap<String, String>();
    private static final String PHONE_TAG_NAME = "mobile";

    public static void init() throws Exception {
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
        Document doc = documentBuilder.parse(new File("E:/ProjectPackage/myself/java/pattern/src/main/java/com/hubq/learn/pattern/factoryPattern/abs/demo2/file.xml"));

        NodeList nodeList = doc.getElementsByTagName(PHONE_TAG_NAME);

        for (int i = 0; i < nodeList.getLength(); i++) {
            NodeList list = nodeList.item(i).getChildNodes();
            for (int j = 0; j < list.getLength(); j++) {
               // Node node
            }
        }
    }
}
