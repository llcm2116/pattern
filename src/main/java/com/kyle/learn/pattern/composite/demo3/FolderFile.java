package com.kyle.learn.pattern.composite.demo3;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: 胡本强
 * Date: 2017-07-06:17:38
 */
public class FolderFile extends AbstractFile {
    private String name;
    private List<AbstractFile> list = new ArrayList<AbstractFile>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void add(AbstractFile abstractFile) {
        list.add(abstractFile);
    }

    public void remove(AbstractFile abstractFile) {
        list.remove(abstractFile);
    }

    public AbstractFile getChild(int i) {
        return null;
    }

    public FolderFile(String name) {
        this.name = name;
    }

    @Override
    public void deleteVirus() {
        System.out.println("开始对文件夹 " + name + " 进行杀毒");
        for (AbstractFile file : list) {
            file.deleteVirus();
        }
    }
}
