package com.kyle.learn.pattern.composite.demo4;

/**
 * Created with IntelliJ IDEA.
 * User: 胡本强
 * Date: 2017-07-06:18:22
 */
public class Client {

    public static void main(String[] args) {
        Branch company = new Branch("北京公司总部");
        Branch branch1 = new Branch("上海分公司");
        Branch branch2 = new Branch("深圳分公司");

        Department department1 = new Department("总公司研发部");
        Department department2 = new Department("总公司财务部");
        Department department3 = new Department("总公司人力资源部");
        Department department4 = new Department("上海分公司研发部");
        Department department5 = new Department("上海分公司财务部");
        Department department6 = new Department("上海分公司人力资源部");
        Department department7 = new Department("深圳分公司研发部");
        Department department8 = new Department("深圳分公司财务部");
        Department department9 = new Department("深圳分公司人力资源部");

        branch1.add(department4);
        branch1.add(department5);
        branch1.add(department6);

        branch2.add(department7);
        branch2.add(department8);
        branch2.add(department9);

        company.add(department1);
        company.add(department2);
        company.add(department3);
        company.add(branch1);
        company.add(branch2);

        company.sendMessage();
    }
}
