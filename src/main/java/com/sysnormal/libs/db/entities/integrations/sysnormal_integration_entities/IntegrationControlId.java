package com.sysnormal.libs.db.entities.integrations.sysnormal_integration_entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
@Getter
@Setter
public class IntegrationControlId implements Serializable {

    @Column(name = "origin_table_id", nullable = false, precision = 19)
    private Long originTableId;

    @Column(name = "register_id", nullable = false, length = 4000)
    private String registerId;

    @Column(name = "destiny_table_id", nullable = false, precision = 19)
    private Long destinyTableId;
    // Getters e Setters



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof IntegrationControlId)) return false;
        IntegrationControlId that = (IntegrationControlId) o;
        return Objects.equals(originTableId, that.originTableId)
                && Objects.equals(registerId, that.registerId)
                && Objects.equals(destinyTableId, that.destinyTableId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(originTableId, registerId, destinyTableId);
    }
}