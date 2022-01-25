package choyh.lines.forexpAnotations;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@Import(ForExpConfiguration.class)
public @interface ForExpAnnotation {
}
