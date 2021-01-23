package es.limit.auth.concept.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableWebFlux
public class LimitAuthConceptAuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(LimitAuthConceptAuthApplication.class, args);
    }

//    public static void main(String[] args) {
//        try (AnnotationConfigApplicationContext context
//                     = new AnnotationConfigApplicationContext(
//                LimitAuthConceptAuthApplication.class)) {
//
//            context.getBean(DisposableServer.class).onDispose().block();
//        }
//    }
//
//    @Bean
//    public DisposableServer disposableServer(ApplicationContext context) {
//        HttpHandler handler = WebHttpHandlerBuilder.applicationContext(context).build();
//        ReactorHttpHandlerAdapter adapter = new ReactorHttpHandlerAdapter(handler);
//        return HttpServer.create().host("localhost")/*.port(8080)*/.handle(adapter).bindNow();
//    }
}
