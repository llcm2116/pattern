package com.kyle.learn.pattern.composite.demo1;

/**
 * Created with IntelliJ IDEA.
 * User: 胡本强
 * Date: 2017-07-06:17:43
 */
public class Client {
    public static void main(String[] args) {
        AbstractFile folder = new FolderFile("主文件夹");
        AbstractFile folder1 = new FolderFile("图片文件夹");
        AbstractFile folder2 = new FolderFile("视频文件夹");

        AbstractFile image1 = new ImageFile("乔峰.jpg");
        AbstractFile image2 = new ImageFile("段誉.jpg");
        AbstractFile image3 = new ImageFile("虚竹.jpg");

        AbstractFile vedio1 = new VedioFile("天龙八部1.mkv");
        AbstractFile vedio2 = new VedioFile("天龙八部2.mkv");
        AbstractFile vedio3 = new VedioFile("天龙八部3.mkv");

        folder1.add(image1);
        folder1.add(image2);
        folder1.add(image3);

        folder2.add(vedio1);
        folder2.add(vedio2);
        folder2.add(vedio3);

        folder.add(folder1);
        folder.add(folder2);

        folder.deleteVirus();
    }
}
