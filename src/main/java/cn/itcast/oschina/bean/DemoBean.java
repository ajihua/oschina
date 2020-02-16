package cn.itcast.oschina.bean;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

import java.util.List;

@XStreamAlias("root")
public class DemoBean {
    public String resultcode;
    public String reason;


    public MyrResult result;


    public static class MyrResult{
        @XStreamImplicit(itemFieldName="item")
        public List<MyItem> item;

        public static class MyItem{
            public String id;
            public String catalog;
        }

    }
}
