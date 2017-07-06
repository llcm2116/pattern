package com.kyle.learn.pattern.composite.demo2;

/**
 * Created with IntelliJ IDEA.
 * User: 胡本强
 * Date: 2017-07-06:17:36
 */
public class ImageFile extends AbstractFile {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public ImageFile(String name){
        this.name = name;
    }

    @Override
    public void deleteVirus() {
        System.out.println("图片文件 " + name + " 已杀毒！");
    }
}
