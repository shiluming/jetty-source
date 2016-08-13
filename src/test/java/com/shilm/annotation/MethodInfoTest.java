package com.shilm.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * Created by rola on 16-8-13.
 */
public class MethodInfoTest {

    public static void main(String[] args) {
        try {
            for(Method method : MethodInfoTest.class.getClassLoader().loadClass("com.shilm.annotation.MethodInfoTest")
                    .getMethods()) {
                if(method.isAnnotationPresent(com.shilm.annotation.MethodInfo.class)) {
                    for(Annotation anno : method.getDeclaredAnnotations()) {
                        System.out.println(" Annotation in method " + method + " = " + anno);
                    }
                    MethodInfo methodAnno = method.getAnnotation(MethodInfo.class);
                    if(methodAnno.revision()==1) {
                        System.out.println("Method with revision no 1 = " + method);
                    }
                }
            }
        } catch(Exception e) {

        }
    }

    @Override
    @MethodInfo(author = "shilm",date="2016-08-13",revision = 1,
            comments = "test")
    public String toString() {
        return "Overriden toString method!";
    }
}
