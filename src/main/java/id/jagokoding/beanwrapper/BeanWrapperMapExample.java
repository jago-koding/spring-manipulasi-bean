package id.jagokoding.beanwrapper;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.BeanWrapperImpl;

import id.jagokoding.TestBean;

public class BeanWrapperMapExample {
    public static void main (String[] args) {
        BeanWrapperImpl bw = new BeanWrapperImpl(new TestBean());

        Map<String, Object> map = new HashMap<>();
        map.put("aString", "SomeString");
        map.put("anInt", "10");
        bw.setPropertyValues(map);
        System.out.println(bw.getWrappedInstance());
    }
}
