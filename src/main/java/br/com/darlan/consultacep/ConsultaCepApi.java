package br.com.darlan.consultacep;

import br.com.darlan.exception.GenericException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("consulta-cep")
public class ConsultaCepApi {

    @GetMapping("{cep}")
    public ResponseEntity<CepResultDTO> consultaCep(@PathVariable("cep") String cep) {

        RestTemplate restTemplate = new RestTemplate();
        try {
            ResponseEntity<CepResultDTO> responseEntity = restTemplate.getForEntity("https://viacep.com.br/ws/" + cep + "/json/",
                    CepResultDTO.class);
            return ResponseEntity.ok(responseEntity.getBody());
        } catch (Exception e) {
            throw new GenericException("Erro desconhecido", cep);
        }
    }
}
