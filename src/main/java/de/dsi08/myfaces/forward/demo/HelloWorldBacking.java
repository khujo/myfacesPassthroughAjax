package de.dsi08.myfaces.forward.demo;

import javax.faces.event.AjaxBehaviorEvent;

public class HelloWorldBacking
{

    private int count = 0;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void headingClicked(AjaxBehaviorEvent event) {
        this.count++;
        System.out.println("test");
    }

}