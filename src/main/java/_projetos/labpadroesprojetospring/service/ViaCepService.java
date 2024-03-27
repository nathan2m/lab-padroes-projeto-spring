package _projetos.labpadroesprojetospring.service;

import _projetos.labpadroesprojetospring.model.Endereco;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/*
 * Client HTTP, criado via OpenFeign, para o consumo da API do ViaCEP.
 *
 * https://spring.io/projects/spring-cloud-openfeign
 * https://viacep.com.br
 */

@FeignClient(name = "viacep", url = "https://viacep.com.br/ws")
public interface ViaCepService {
    @GetMapping("/{cep}/json/")
    Endereco consultarCep(@PathVariable("cep") String cep);
}
