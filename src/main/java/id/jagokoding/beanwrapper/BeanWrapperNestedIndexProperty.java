package id.jagokoding.beanwrapper;

import java.util.ArrayList;

import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;

import id.jagokoding.TestBean;
import id.jagokoding.TestBean3;

public class BeanWrapperNestedIndexProperty {
    public static void main (String[] args) {
        TestBean3 testBean = new TestBean3();
        testBean.setTestBeans(new ArrayList<>());
        testBean.setTestBeans(0, new TestBean());
        testBean.setTestBeans(1, new TestBean());

        BeanWrapper bw2 = new BeanWrapperImpl(testBean);
        bw2.setPropertyValue("testBeans[0].aString", "aStr0");
        bw2.setPropertyValue("testBeans[0].anInt", "3");

        bw2.setPropertyValue("testBeans[1].aString", "aStr1");
        bw2.setPropertyValue("testBeans[1].anInt", "6");
        System.out.println(bw2.getWrappedInstance());
    }
}