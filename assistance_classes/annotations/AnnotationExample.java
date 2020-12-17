package assistance_classes.annotations;

import java.lang.reflect.Method;

public class AnnotationExample {
    @MyAnnotation
    public void testDefaults() throws Exception {
        Method method = AnnotationExample.class.getMethod("testDefaults", null);
        MyAnnotation annotation = (MyAnnotation)method.getAnnotation(MyAnnotation.class);
        print(annotation);
    }

    @MyAnnotation(key = "baz", value = "buzz")
    public void testValues1() throws Exception {
        Method method = AnnotationExample.class.getMethod("testValues1", null);
        MyAnnotation annotation = (MyAnnotation)method.getAnnotation(MyAnnotation.class);
        print(annotation);
    }

    @MyAnnotation(key = "gbas", value = "gbos")
    public void testValues2() throws NoSuchMethodException {
        Method method = AnnotationExample.class.getMethod("testValues2", null);
        MyAnnotation annotation = (MyAnnotation)method.getAnnotation(MyAnnotation.class);
        print(annotation);
    }

    public void print(MyAnnotation annotation) {
        System.out.println(annotation.key() + " = " + annotation.value());
    }
}
