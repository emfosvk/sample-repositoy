package choyh.lines.forcmsAnotations;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@Import(ForCmsConfiguration.class)
public @interface ForCmsAnnotation {
}
