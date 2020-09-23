package id.jagokoding.propertyacessorfactory;

import org.springframework.beans.BeanWrapper;
import org.springframework.beans.PropertyAccessorFactory;

import id.jagokoding.TestBean;

public class PropertyAccessorFactoryExample {

	public static void main (String[] args) {
        BeanWrapper bw = PropertyAccessorFactory.forBeanPropertyAccess(new TestBean());
        bw.setPropertyValue("aString", "JAGO KODING");
        System.out.println(bw.getWrappedInstance());
    }
	
}
