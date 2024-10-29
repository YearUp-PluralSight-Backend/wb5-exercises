package com.pluralsight.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        Container container = new Container();
        container.init();

        Class<?> clazz = Class.forName("com.pluralsight.Garage");
//        Object obj = container.getVehicleInstancesByClass(clazz);
        Object instance = container.createInstance(clazz);
        Field field = clazz.getDeclaredField("Garage");
        field.setAccessible(true);
        Object fieldValue = field.get(instance);
        Method[] methods = fieldValue.getClass().getDeclaredMethods();
        for (Method method: methods) {
            method.invoke(method.getName());
        }

    }
}