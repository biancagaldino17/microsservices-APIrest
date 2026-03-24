package microsservices.produto_service.controller;

import org.springframework.web.bind.annotation.*;

import java.util.Map;


@RestController
@RequestMapping("/produto")
public class ProdutoController {

    @GetMapping("/{id}")
    public Map<String, Object> getProduto(@PathVariable Integer id) throws InterruptedException {

        if(id == 99){
            Thread.sleep(10000);
        }

        return switch (id) {
            case 1 -> Map.of("nome", "Notebook", "preco", 3500);

            case 2 -> Map.of("nome", "Mouse", "preco", 100);

            case 3 -> Map.of("nome", "Teclado", "preco", 200);

            default -> throw new RuntimeException("Produto não encontrado");

        };
    }
}
