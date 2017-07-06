package com.kyle.learn.pattern.composite.demo2;

/**
 * Created with IntelliJ IDEA.
 * User: 胡本强
 * Date: 2017-07-06:17:36
 */
public class VedioFile extends AbstractFile {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public VedioFile(String name){
        this.name = name;
    }


    @Override
    public void deleteVirus() {
        System.out.println("视频文件 " + name + " 已杀毒！");
    }
}
