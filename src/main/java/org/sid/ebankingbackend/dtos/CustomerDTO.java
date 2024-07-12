package org.sid.ebankingbackend.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
public class CustomerDTO {
    private long id;
    private String name;
    private String email;

}
