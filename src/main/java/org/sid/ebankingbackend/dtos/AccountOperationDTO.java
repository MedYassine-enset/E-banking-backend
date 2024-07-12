package org.sid.ebankingbackend.dtos;

import jakarta.persistence.*;
import lombok.Data;
import org.sid.ebankingbackend.entites.BankAccount;
import org.sid.ebankingbackend.enums.OperationType;

import java.util.Date;

@Data
public class AccountOperationDTO {

    private Long id;
    private Date operationDate;
    private double amount;
    private OperationType type;
    private String description;
}
