package com.example.hanruweather.provider;

import com.example.hanruweather.ResourceTable;
import com.example.hanruweather.utils.DateUtils;
import ohos.aafwk.ability.AbilitySlice;
import ohos.agp.components.*;

import java.util.List;
import java.util.Map;

/**
 * 更多的天气预报的数据
 */
public class WeatherPageProvider extends PageSliderProvider {
    // 数据源
    private List<Map<String, String>> list;
    private AbilitySlice slice;

    public WeatherPageProvider(List<Map<String, String>> list,AbilitySlice slice) {
        this.list = list;
        this.slice = slice;
    }
    /**
     * 表示当前 Provider 当中加载数据的条目
     * @return 返回值表示 Provider 中数据条目个数
     */
    @Override
    public int getCount() {
        return list.size();
    }
    /**
     * 表示根据下标实例化 PageSlider 中每个page页数据
     *
     * @param componentContainer，表示当前实例化item属于的 PageSlider 控件
     * @param position，表示当前实例化下标
     * @return
     */
    @Override
    public Object createPageInContainer(ComponentContainer componentContainer, int position) {
        // 1.根据下标获取数据
        Map<String,String> map= list.get(position);
        // 2.将xml文件转为Component对象


        Component component = LayoutScatter.getInstance(slice).parse(ResourceTable.Layout_page_slider,null,false);

        Text textDate = (Text) component.findComponentById(ResourceTable.Id_text_date);
        Text textTemp = (Text) component.findComponentById(ResourceTable.Id_text_temp);
        Text textHumidity = (Text) component.findComponentById(ResourceTable.Id_text_humidity);
        Text textSpeed = (Text) component.findComponentById(ResourceTable.Id_text_wind);

        String dt_txt= map.get("dt_txt");
        textDate.setText(DateUtils.getWeek(dt_txt)+", "+DateUtils.getDate(dt_txt));
        textTemp.setText("温度："+map.get("temp")+"°C");
        textHumidity.setText("湿度："+map.get("humidity")+"%");
        textSpeed.setText("风速："+map.get("speed"));

        // 3.将component添加到page中
        componentContainer.addComponent(component);
        return component;
    }

    @Override
    public void destroyPageFromContainer(ComponentContainer componentContainer, int position, Object object) {
        componentContainer.removeComponent((Component) object);
    }

    @Override
    public boolean isPageMatchToObject(Component component, Object o) {
        return true;
    }
}