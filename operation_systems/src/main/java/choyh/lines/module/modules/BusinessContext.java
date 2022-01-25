package choyh.lines.module.modules;

import choyh.lines.forbwiAnotations.ForBwiAnotation;
import choyh.lines.forcmsAnotations.ForCmsAnnotation;
import choyh.lines.forexpAnotations.ForExpAnnotation;
import choyh.lines.forpmsAnotations.ForPmsAnnotation;
import choyh.lines.forwithAnotations.ForWithAnnotation;
import choyh.lines.operation_systems.StarterAnnotation;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;

@Configuration
@StarterAnnotation
@ForBwiAnotation
@ForCmsAnnotation
@ForPmsAnnotation
@ForExpAnnotation
@ForWithAnnotation
@EnableAutoConfiguration
public class BusinessContext {
}
