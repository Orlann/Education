package com.boostbrain.reflectionLesson19;

import com.boostbrain.annotationsLesson17.Annotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionChecker {
    public void showClassName(Object object) {
        Class classInstance = object.getClass();
        System.out.println(classInstance.getName());
    }

    public void showClassFields(Object object) {
        Class classInstance = object.getClass();
        Field[] fields = classInstance.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getName());
        }
    }

    @Deprecated
    public void showClassMethods(Object object) {
        Class classInstance = object.getClass();
        Method[] methods = classInstance.getMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
        }
    }

    public void showFieldsAnnotations(Object object) {
        Class classInstance = object.getClass();
        Field[] fields = classInstance.getDeclaredFields();
        for (Field field : fields) {
            Annotation[] annotations = field.getAnnotations();
            for (Annotation annotation : annotations) {
                System.out.println(field.getName() + ": " + annotation.toString());
            }
        }
    }

    public void showMethodsAnnotations(Object object) {
        Class classInstance = object.getClass();
        Method[] methods = classInstance.getMethods();
        for (Method method : methods) {
            Annotation[] annotations = method.getDeclaredAnnotations();
            for (Annotation annotation : annotations) {
                System.out.println(method.getName() + ": " + annotation.toString());
            }
        }
    }

    public void fillPrivateFields(Object object) throws IllegalAccessException {
        Class classInstance = object.getClass();
        Field[] fields = classInstance.getDeclaredFields();
        for (Field field : fields) {
            Annotation[] annotations = field.getAnnotations();
            for (Annotation annotation : annotations) {
                Annotation annotation1 = field.getAnnotation(RabbitAnnotation.class);
                if (annotation1 == null) {
                    continue;
                }
                field.setAccessible(true);      // make private field public
                field.set(object, "Puffy");
                field.setAccessible(false);
            }
        }
    }

    public Object createNewObject(Object object) throws IllegalAccessException, InstantiationException {
        Class classInstance = object.getClass();
        return classInstance.newInstance();
    }
}
