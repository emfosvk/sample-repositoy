package choyh.lines.forwithAnotations;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@Import(ForWithConfiguration.class)
public @interface ForWithAnnotation {
}
