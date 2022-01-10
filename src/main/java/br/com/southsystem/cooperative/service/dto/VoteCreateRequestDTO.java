package br.com.southsystem.cooperative.service.dto;

import br.com.southsystem.cooperative.domain.enumeration.VoteType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class VoteCreateRequestDTO {

    private VoteType vote;
    @NotNull(message = "The session id cannot be null!")
    private Long sessionId;
    @NotNull(message = "The Affiliated's CPF cannot be blank")
    private String affiliatedCpf;

}
