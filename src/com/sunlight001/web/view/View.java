package com.sunlight001.web.view;


/**
 * 视图模型
 * request范围的数据存储类，当需要发送数据到客户端显示时，就可以将要显示的数据存储到ViewData类中。
 * 使用ViewData.put(String name,Object value)方法往request对象中存数据。
 **/
public class View {

    private String url;//跳转路径
    
    private String dispathAction = DispatchActionConstant.FORWARD;//跳转方式

    public View(String url) {
        this.url = url;
    }
    
    public View(String url,String name,Object value) {
        this.url = url;
        ViewData view = new ViewData();
        view.put(name, value);
    }
    
    
    public View(String url,String name,String dispathAction ,Object value) {
        this.dispathAction = dispathAction;
        this.url = url;
        ViewData view = new ViewData();//请看后面的代码
        view.put(name, value);
    }
    
    
    public String getUrl() {
        return url;
    }
    
    
    public void setUrl(String url) {
        this.url = url;
    }

    public String getDispathAction() {
        return dispathAction;
    }

    public void setDispathAction(String dispathAction) {
        this.dispathAction = dispathAction;
    }
}
