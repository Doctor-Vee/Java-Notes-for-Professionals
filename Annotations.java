import assistance_classes.annotations.AnnotationExample;
import assistance_classes.annotations.RuntimeCheck1;
import assistance_classes.annotations.RuntimeCheck2;

import java.lang.annotation.Annotation;
import java.util.Arrays;

public class Annotations {
    public static void main(String[] args) {
        String manicure = "    Hello world!    ";
        manicure.trim();
        System.out.print(manicure);
        System.out.println(manicure);
        System.out.println("==================== Annotations ====================");
        Annotation[] annotationsByType = RuntimeCheck1.class.getAnnotations();
        Annotation[] annotationsByType2 = RuntimeCheck2.class.getAnnotations();

        System.out.println("default retention: " + Arrays.toString(annotationsByType)); // this doesn't display a value because the Annotation used on the RuntimeCheck1 class does not have Retention Policy indicated in it
        System.out.println("runtime retention: " + Arrays.toString(annotationsByType2));

        System.out.println("----------- Getting Annotation values at run-time ------------");
        AnnotationExample example = new AnnotationExample();
        try {
            example.testDefaults();
            example.testValues1();
            example.testValues2();
        } catch (Exception e) {
            System.err.println("Exception [" + e.getClass().getName() + "] - " + e.getMessage());
            e.printStackTrace(System.err);
        }
    }
}
