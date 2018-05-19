package test.chao.project;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @author xiezhengchao
 * @since 2018/5/19 18:30
 */
@Profile("project-b")
@Configuration
@SameNameBean.ProjectBFlag
public class SameNameBean {

    @Bean
    public ServiceB serviceB() {
        return new ServiceB();
    }

    @Target(ElementType.TYPE)
    @Retention(RetentionPolicy.RUNTIME)
    @interface ProjectBFlag {
    }
}
