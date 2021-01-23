package es.limit.auth.concept.auth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.List;

@RestController
//@RequestMapping("/usuaris")
public class RolController {

    @GetMapping("/")
    public Mono<String> get() {
        return Mono.just("Limit Auth Concept WORKING");
    }

    @GetMapping("/usuaris/{usuari}/rols")
    public Mono<List<String>> getUserRoles(
            @PathVariable("usuari") String usuari,
            @RequestHeader(value = "limit-identificador", required = false) String identificador,
            @RequestHeader(value = "limit-empresa", required = false) String empresa
    ) {
        List<String> rols = new ArrayList<>();
        if (!"ningu".equalsIgnoreCase(usuari)) {
//            return Mono.empty();
//        } else {
            rols.add("LIM_USER");

            if ("ID1".equalsIgnoreCase(identificador)) {
                rols.add("LIM_ID1");
            } else if ("ID2".equalsIgnoreCase(identificador)) {
                rols.add("LIM_ID2");
            }
            if ("EM1".equalsIgnoreCase(empresa)) {
                rols.add("LIM_EM1");
            } else if ("EM2".equals(empresa)) {
                rols.add("LIM_EM2");
            }
        }

        return Mono.just(rols);
    }
}

