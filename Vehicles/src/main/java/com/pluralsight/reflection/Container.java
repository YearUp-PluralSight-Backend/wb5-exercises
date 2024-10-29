package com.pluralsight.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class Container {

    private Map<Class<?>, Method> methods;
    private Object config;
    private Map<Class<?>, Object> vehicles;


    public void init() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        this.methods = new HashMap<>();
        this.vehicles = new HashMap<>();
        Class<?> clazz = Class.forName("com.pluralsight.reflection.Config");
        Method[] declaredMethods = clazz.getDeclaredMethods();

        for (Method method: declaredMethods) {
            if(method.getDeclaredAnnotation(Bean.class) != null) {
                this.methods.put(method.getReturnType(), method);
                System.out.println(method.getName());
            }
        }

        this.config = clazz.getConstructor().newInstance();
    }

    public Object getVehicleInstancesByClass(Class<?> clazz) throws InvocationTargetException, IllegalAccessException {
        if (this.vehicles.containsKey(clazz)) {
            return this.vehicles.get(clazz);
        } else {
            if (this.methods.containsKey(clazz)) {
                Method method = this.methods.get(clazz);
                Object obj = method.invoke(this.config);
                this.vehicles.put(method.getReturnType(), method);
                return obj;

            }
        }


        return  null;
    }


    public Object createInstance(Class<?> clazz) throws InvocationTargetException, IllegalAccessException, InstantiationException, NoSuchMethodException {
        Constructor<?>[] declaredConstructors = clazz.getDeclaredConstructors();
        for (Constructor<?> constructor : declaredConstructors) {
            if (constructor.getDeclaredAnnotation(Autowired.class) != null) {
                Class<?>[] parameterTypes = constructor.getParameterTypes();
                Object[] arguments = new Object[parameterTypes.length];
                for (int i = 0; i < parameterTypes.length; i++) {
                    arguments[i] = getVehicleInstancesByClass(parameterTypes[i]);
                }
                constructor.newInstance(arguments);

            }
        }

        return clazz.getConstructor().newInstance();


    }

}
