package com.food.ordering.system.customer.service.domain.dto.create;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.util.UUID;

@Getter
@Builder
@AllArgsConstructor
public class CreateCustomerResponse {
    @NotNull
    private final String message;

    @NotNull
    private final UUID customerId;
}

