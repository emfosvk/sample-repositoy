package choyh.lines.operation_systems;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@Import(StarterConfiguration.class)
public @interface StarterAnnotation {

}
