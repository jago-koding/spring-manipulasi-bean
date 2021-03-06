package id.jagokoding.beanwrapper;

import java.beans.PropertyDescriptor;

import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;
import org.springframework.beans.PropertyValue;

import id.jagokoding.TestBean;

public class BeanWrapperPropertyDescriptorExample {
    public static void main (String[] args) {


        BeanWrapper bw = new BeanWrapperImpl(new TestBean());
        bw.setPropertyValue("aString", "someString");
        PropertyValue pv = new PropertyValue("anInt", "3");
        bw.setPropertyValue(pv);
        System.out.println(bw.getWrappedInstance());
        for (PropertyDescriptor pd : bw.getPropertyDescriptors()) {
            System.out.println(pd.getDisplayName() + "  " + pd.getPropertyType());
        }
    }
}