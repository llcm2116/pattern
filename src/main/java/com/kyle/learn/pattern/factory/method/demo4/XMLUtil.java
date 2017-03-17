package com.kyle.learn.pattern.factory.method.demo4;

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
 * User: 胡本强
 * Date: 2017-03-17:16:53
 */
public class XMLUtil {
    private static final Map<String, String> map = new HashMap<String, String>();
    private static final String LOGGER_TAG_NAME = "logger";

    public static void init() throws Exception {
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
        Document doc = documentBuilder.parse(new File("E:\\github\\java\\pattern\\src\\main\\java\\com\\kyle\\learn\\pattern\\factory\\method\\demo4\\file.xml"));

        NodeList nodeList = doc.getElementsByTagName(LOGGER_TAG_NAME);

        for (int i = 0; i < nodeList.getLength(); i++) {
            NodeList childLists = nodeList.item(i).getChildNodes();
            String name = null;
            String clzz = null;
            for (int j = 0; j < childLists.getLength(); j++) {
                Node node = childLists.item(j);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    if ("name".equals(node.getNodeName())) {
                        name = node.getFirstChild().getNodeValue();
                    } else if ("class".equals(node.getNodeName())) {
                        clzz = node.getFirstChild().getNodeValue();
                    }
                }
            }

            map.put(name, clzz);
        }
    }

    public static String getBeans(String name) throws Exception {
        if (map == null || map.entrySet().size() == 0) {
            init();
        }

        return map.get(name);
    }
}
