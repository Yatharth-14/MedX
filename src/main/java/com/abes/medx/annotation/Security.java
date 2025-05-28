package com.abes.medx.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

/**
 * Custom annotation to enforce security roles (e.g., Admin).
 */
@Retention(RetentionPolicy.RUNTIME)  
@Target(ElementType.TYPE)           
public @interface Security {
    String role();  
}
