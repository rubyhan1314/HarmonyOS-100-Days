package com.example.hanruqiushibaike;

import com.example.hanruqiushibaike.constant.Constant;
import com.example.hanruqiushibaike.utils.HttpUtils;
import com.example.hanruqiushibaike.utils.JsonParseUtils;
import org.junit.Test;

import java.util.List;
import java.util.Map;

public class ExampleTest {
    @Test
    public void onStart() {
    }

    @Test
    public void testHttpUtils(){
        String json = HttpUtils.getJsonFromNet(Constant.QIUSHIBAIKE_URL);
        System.out.println("json--"+json);
    }

    @Test
    public void testJson(){
        List<Map<String, String>> list = JsonParseUtils.parseJsonToList(HttpUtils.getJsonFromNet(Constant.QIUSHIBAIKE_URL));
        System.out.println(list.size());
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
