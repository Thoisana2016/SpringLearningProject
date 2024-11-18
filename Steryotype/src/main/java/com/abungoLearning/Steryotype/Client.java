package com.abungoLearning.Steryotype;

import com.abungoLearning.Steryotype.DemoController.DemoController;
import com.abungoLearning.Steryotype.DemoRepository.DemoRepository;
import com.abungoLearning.Steryotype.DemoServices.DemoService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        DemoController controller = applicationContext.getBean(DemoController.class);
        System.out.println(controller.helloController());

        DemoService service = applicationContext.getBean(DemoService.class);
        System.out.println(service.demoService());

        DemoRepository repository = applicationContext.getBean(DemoRepository.class);
        System.out.println(repository.helloRepository());
    }
}
