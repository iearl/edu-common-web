package com.ants.common.web.logs;

import java.lang.annotation.*;

/**
 * 是否添操作日志注解
 */

@Target({ ElementType.PARAMETER, ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface SystemLog {
	String module() default "";

	String methods() default "";
}