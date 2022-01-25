package choyh.lines.forpmsAnotations;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@Import(ForPmsConfiguration.class)
public @interface ForPmsAnnotation {
}
