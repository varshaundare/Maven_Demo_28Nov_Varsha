package testNG.RetryAnalysis;

import org.testng.IAnnotationTransformer;

public class IAnnotationTransformationExample implements IAnnotationTransformer {
    public void transform(org.testng.annotations.ITestAnnotation annotation, java.lang.Class testClass, java.lang.reflect.Constructor testConstructor, java.lang.reflect.Method testMethod) {
        annotation.setRetryAnalyzer(IRetryAnalyserExample.class);
    }
}

