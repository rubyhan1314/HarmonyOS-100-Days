package com.example.hanruqiushibaike.provider;

import com.example.hanruqiushibaike.ResourceTable;
import ohos.aafwk.ability.AbilitySlice;
import ohos.agp.components.*;

import java.util.List;
import java.util.Map;

public class ListItemProvider  extends  BaseItemProvider{

    private List<Map<String, String>> list;
    private AbilitySlice  slice;

    public ListItemProvider(List<Map<String, String>> list, AbilitySlice slice) {
        this.list = list;
        this.slice = slice;
    }

    @Override
    public int getCount() {
        return list == null?0: list.size();//一般返回数据源的长度
    }

    @Override
    public Object getItem(int position) {
        if(list!= null && position >= 0 && position < list.size()){
            return list.get(position);
        }
        return null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public Component getComponent(int position, Component convertComponent, ComponentContainer componentContainer) {
        final Component cpt;
        // 如果还没有convertComponent对象，那么将xml布局文件转为一个Component对象。
        if(convertComponent == null){
            //从当前的AbilitySlice对应的xml布局中，
            cpt = LayoutScatter.getInstance(slice).parse(ResourceTable.Layout_list_item,null,false);
        }else{
            cpt = convertComponent;
        }
        Map<String,String> map =list.get(position);//获取数据
        Text textId = (Text) cpt.findComponentById(ResourceTable.Id_list_item_id);
        Text textUser = (Text) cpt.findComponentById(ResourceTable.Id_list_item_user);
        Text textContent = (Text) cpt.findComponentById(ResourceTable.Id_list_item_content);

        textId.setText("用户ID："+map.get("id"));
        textUser.setText("用户名："+map.get("login"));
        textContent.setText(map.get("content"));
        String content = map.get("content");

        return cpt;
    }
}

