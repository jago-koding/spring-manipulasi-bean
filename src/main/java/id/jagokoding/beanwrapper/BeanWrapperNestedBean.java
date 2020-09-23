package id.jagokoding.beanwrapper;

import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;

import id.jagokoding.TestBean;
import id.jagokoding.TestBean2;

public class BeanWrapperNestedBean {
    public static void main (String[] args) {
        BeanWrapper bw2 = new BeanWrapperImpl(new TestBean2());
        bw2.setPropertyValue("anotherString", "stringVal");

        BeanWrapper bw = new BeanWrapperImpl(new TestBean());
        bw.setPropertyValue("anInt", 3);
        bw.setPropertyValue("aString", "aStrVal");

        bw2.setPropertyValue("testBean", bw.getWrappedInstance());
        System.out.println(bw2.getWrappedInstance());
    }
}
