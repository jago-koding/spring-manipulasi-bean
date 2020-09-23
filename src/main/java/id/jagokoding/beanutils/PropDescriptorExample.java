package id.jagokoding.beanutils;

import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.util.Arrays;

import org.springframework.beans.BeanUtils;

import id.jagokoding.TestBean;

public class PropDescriptorExample {
    public static void main (String[] args) throws IntrospectionException {
        PropertyDescriptor[] actual = Introspector.getBeanInfo(TestBean.class)
                                                  .getPropertyDescriptors();
        PropertyDescriptor[] descriptors = BeanUtils.getPropertyDescriptors(TestBean.class);

        System.out.println(Arrays.toString(actual));
        System.out.println(Arrays.toString(descriptors));
    }
}