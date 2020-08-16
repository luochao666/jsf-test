package com.booway.jsf.bean;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;



@ManagedBean(name = "role")
@RequestScoped
public class Role implements Serializable
{

    private static final long serialVersionUID = -4090627688696374978L;
    
    private String item;
    
    private static Map<String, String > itemMap = new LinkedHashMap<>();
    
    {
        itemMap.put("teacher", "teacher");
        itemMap.put("student", "student");
        itemMap.put("worker", "worker");
        itemMap.put("master", "master");
    }
    
    public Role(){
        
    }

    public String getItem()
    {
        return item;
    }

    public void setItem(String item)
    {
        this.item = item;
    }
    
    public Map<String, String> getItemValue(){
        return itemMap;
    }
    
    public String convert(){
        if ("teacher".equals(item))
        {
            item = "老师";
        }
        if ("master".equals(item))
        {
            item = "大师";
        }
        if ("student".equals(item))
        {
            item = "学生";
        }
        if ("worker".equals(item))
        {
            item = "工人";
        }
        return "selected";
    }

}
