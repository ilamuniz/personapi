package one.digitalinnovation.personapi.dto.request;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PersonDTO {

    private Long id;

    @NotNull         //não funciona nem o @NotEmpty e nem o @Size(min = 2, max = 100)
    private String firstName;

    @NotNull
    private String lastName;

    @NotNull          //não funciona anotação @CPF também
    private String cpf;

    private String birthDate;

    @NotNull   //não funciona anotação @Valid
    private List<PhoneDTO> phones;
}
