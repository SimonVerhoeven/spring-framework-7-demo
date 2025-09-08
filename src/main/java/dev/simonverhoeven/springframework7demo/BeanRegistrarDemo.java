package dev.simonverhoeven.springframework7demo;

import org.springframework.beans.factory.BeanRegistrar;
import org.springframework.beans.factory.BeanRegistry;
import org.springframework.core.env.Environment;

public class BeanRegistrarDemo implements BeanRegistrar {

    @Override
    public void register(BeanRegistry registry, Environment environment) {
        registry.registerBean("someBean", SomeBean.class, someBeanSpec ->
                someBeanSpec.prototype()
                        .description("Some bean")
                        .order(1)
                        .lazyInit()
                        .supplier(supplierContext -> new SomeBean())
        );
    }
}
