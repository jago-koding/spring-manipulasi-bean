package id.jagokoding.beanwrapper;

import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;

import id.jagokoding.TestBean;
import id.jagokoding.TestBean2;

public class BeanWrapperNestedBean2 {
    public static void main (String[] args) {
        TestBean2 testBean2 = new TestBean2();
        testBean2.setTestBean(new TestBean());

        BeanWrapper bw2 = new BeanWrapperImpl(testBean2);
        bw2.setPropertyValue("anotherString", "stringVal");
        bw2.setPropertyValue("testBean.aString", "aStr");
        bw2.setPropertyValue("testBean.anInt", 7);

        System.out.println(bw2.getWrappedInstance());

    }
}