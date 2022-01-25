package choyh.lines.forbwiAnotations;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@Import(ForBwiConfiguration.class)
public @interface ForBwiAnotation {
}
