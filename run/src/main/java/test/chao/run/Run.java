package test.chao.run;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import test.chao.project.ServiceA;
import test.chao.project.ServiceB;

/**
 * @author xiezhengchao
 * @since 2018/5/19 18:28
 */
@SpringBootApplication(scanBasePackages = "test")
public class Run implements CommandLineRunner, BeanFactoryAware {

    private BeanFactory beanFactory;

    public static void main(String[] args) {
        SpringApplication.run(Run.class, args);
    }

    @Override
    public void run(String...strings) throws Exception {

        if (beanFactory.containsBean("serviceA")) {
            ServiceA serviceA = (ServiceA) beanFactory.getBean("serviceA");
            System.out.println(serviceA);
        }

        if (beanFactory.containsBean("serviceB")) {
            ServiceB serviceb = (ServiceB) beanFactory.getBean("serviceB");
            System.out.println(serviceb);
        }

    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory = beanFactory;
    }
}
