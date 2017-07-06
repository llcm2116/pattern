package com.kyle.learn.pattern.adapter.demo5;

/**
 * Created with IntelliJ IDEA.
 * User: 胡本强
 * Date: 2017-06-23:16:27
 */
public class EntryptAdapter  extends OAEntrypt{
    private EntryptOperation operation = new EntryptOperation();
    @Override
    public void entrypt() {
        operation.specialEnry();
    }
}
