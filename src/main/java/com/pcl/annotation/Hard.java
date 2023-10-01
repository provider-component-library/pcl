package com.pcl.annotation;

import com.pcl.provider.InternalProvider;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * An annotation to mark providers which are hard dependencies of the current provider. {@link InternalProvider}
 * will have logic on preloading these dependencies as they are sure to be needed in the execution.
 */

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Hard {
}
