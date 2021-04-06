package com.learngraphq.domain.bank;

import lombok.Builder;
import lombok.Setter;

import java.util.UUID;

@Setter
@Builder
public class Asset {
    UUID id;
}
