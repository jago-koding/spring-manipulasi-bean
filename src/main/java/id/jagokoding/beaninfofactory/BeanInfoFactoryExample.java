package id.jagokoding.beaninfofactory;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;

import org.springframework.beans.ExtendedBeanInfoFactory;

public class BeanInfoFactoryExample {
    public static void main (String[] args) throws IntrospectionException {
        System.out.println("-------- JDK Introspector -");
        useIntrospector();
        System.out.println("-------- Spring BeanInfoFactory -");
        useBeanInfoFactory();
    }

    private static void useBeanInfoFactory () throws IntrospectionException {
        ExtendedBeanInfoFactory factory = new ExtendedBeanInfoFactory();
        BeanInfo beanInfo = factory.getBeanInfo(MyBean.class);
        for (PropertyDescriptor propertyDescriptor : beanInfo.getPropertyDescriptors()) {
            System.out.println(propertyDescriptor);
        }
    }

    private static void useIntrospector () throws IntrospectionException {
        BeanInfo beanInfo = Introspector.getBeanInfo(MyBean.class);
        for (PropertyDescriptor propertyDescriptor : beanInfo.getPropertyDescriptors()) {
            System.out.println(propertyDescriptor);
        }
    }

    private static class MyBean {
        private String name;

        public String getName () {
            return name;
        }

        public String setName (String str) {
            this.name = "MyBean-" + str;
            return name;
        }
    }
}