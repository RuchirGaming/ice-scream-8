package com.fyber.inneractive.sdk.util;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes3.dex */
public class c1 {
    public static Integer a(Node node, String str) {
        String strB = b(node, str);
        if (TextUtils.isEmpty(strB)) {
            return null;
        }
        try {
            return Integer.valueOf(strB);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static String b(Node node, String str) {
        Node namedItem;
        if (node == null || str == null || (namedItem = node.getAttributes().getNamedItem(str)) == null) {
            return null;
        }
        return namedItem.getNodeValue();
    }

    public static List<Node> c(Node node, String str) {
        ArrayList arrayList = new ArrayList();
        if (node != null) {
            NodeList childNodes = node.getChildNodes();
            for (int i2 = 0; i2 < childNodes.getLength(); i2++) {
                Node nodeItem = childNodes.item(i2);
                if (nodeItem.getNodeName().equals(str)) {
                    arrayList.add(nodeItem);
                }
            }
        }
        return arrayList;
    }

    public static Node d(Node node, String str) {
        if (node == null) {
            return null;
        }
        NodeList childNodes = node.getChildNodes();
        for (int i2 = 0; i2 < childNodes.getLength(); i2++) {
            Node nodeItem = childNodes.item(i2);
            if (nodeItem.getNodeName().equals(str)) {
                return nodeItem;
            }
        }
        return null;
    }

    public static String a(Node node) {
        if (node == null || node.getFirstChild() == null || node.getFirstChild().getNodeValue() == null) {
            return null;
        }
        return node.getFirstChild().getNodeValue().trim();
    }
}
