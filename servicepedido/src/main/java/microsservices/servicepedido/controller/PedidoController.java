package microsservices.servicepedido.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.*;
import java.util.Map;

@RestController
@RequestMapping("/pedido")
public class PedidoController {

    @Autowired

    private RestTemplate restTemplate;

    private final String URL = "http://produto-service:8080/produto/";
    @GetMapping("/{id}")
    public Map<String, Object> getPedido(@PathVariable Integer id) {

        try {
            Map<String, Object> produto = restTemplate.getForObject(URL + id, Map.class);

            return Map.of(
                    "pedido_id", id,
                    "produto", produto,
                    "status", "confirmado"
            );

        } catch (ResourceAccessException e) {
            return Map.of("erro", "Serviço de produto indisponível");

        } catch (Exception e) {
            e.printStackTrace();
            return Map.of("erro", "Erro inesperado");
        }
    }

    @GetMapping("/teste")

    public String teste() {

        return "ok";
    }


}


