package com.kyle.learn.pattern.composite.demo4;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: 胡本强
 * Date: 2017-07-06:18:17
 */
public class Branch extends Company {
    private String name;
    private List<Company> list = new ArrayList<Company>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void add(Company company) {
        list.add(company);
    }

    public void remove(Company company) {
        list.remove(company);
    }

    public Branch(String name) {
        this.name = name;
    }

    @Override
    public void sendMessage() {
        System.out.println("公司 " + name + " 下的单位开始发通知");

        for (Company company : list) {
            company.sendMessage();
        }
    }
}
