package id.jagokoding.beanwrapper;

import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;

import id.jagokoding.TestBean;

public class BeanWrapperReadOnlyCheckExample {
    public static void main (String[] args) {
        BeanWrapper bw = new BeanWrapperImpl(new TestBean());
        bw.setPropertyValue("aString", "someString");
        System.out.println("date read only: " + bw.isReadableProperty("date"));
        //bw.isWritableProperty(..)
        System.out.println(bw.getWrappedInstance());
    }
}