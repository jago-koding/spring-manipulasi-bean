package id.jagokoding.beanwrapper;

import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;
import org.springframework.beans.PropertyValue;

import id.jagokoding.TestBean;

public class BeanWrapperExample {
    public static void main (String[] args) {
        BeanWrapper bw = new BeanWrapperImpl(new TestBean());
        bw.setPropertyValue("aString", "someString");
        PropertyValue pv = new PropertyValue("anInt", 3);
        // baris komentar berikutnya juga akan berfungsi
        /* PropertyValue pv = new PropertyValue ("anInt", "3"); */
        bw.setPropertyValue(pv);
        System.out.println(bw.getWrappedInstance());

    }
}