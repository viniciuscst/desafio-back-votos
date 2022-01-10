package br.com.southsystem.cooperative.client;

import br.com.southsystem.cooperative.service.dto.CpfExternalApiResultDTO;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient(name = "cpfValidate", url = "${cooperative.cpfExternalApi.url}")
public interface VerifyCPFClient {

    @GetMapping(value = "/{cpf}")
    CpfExternalApiResultDTO verifyCpfIsAbleToVote(@PathVariable("cpf") String cpf);
}