package com.github.cauafernandess.gs_3_wellbeing_monitor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/info")
public class TemaController {
    @GetMapping
    public Map<String, String> getInfo() {
        Map<String, String> info = new HashMap<>();
        info.put("tema", "Monitoramento de Bem Estar");
        info.put("membro1", "Caua Fernandes - RM551765");
        info.put("membro2", "Felipe Pereira Meschiatti - RM551978");
        info.put("descricao", "API para monitorar indicadores de bem-estar sem uso de banco de dados, utilizando Java e Spring Boot.");
        return info;
    }
}