package com.sysnormal.data.integrations.sysnormal_integration_data_model.entities;

import com.sysnormal.data.base_data_model.entities.BaseEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

/**
 * Entity class
 */
@Entity
@Table(name = "integration_control")
@Getter
@Setter
public class IntegrationControl extends BaseEntity {

    @EmbeddedId
    private IntegrationControlId id;

    @CreationTimestamp
    @Column(name = "created_at", nullable = false, scale = 6, updatable = false)
    private LocalDateTime createdAt;

    @Column(name = "operation", nullable = false, length = 200)
    @ColumnDefault("'UPDATE'")
    private String operation = "UPDATE" ;

    @Lob
    @Column(name = "values_to_integrate")
    private byte[] valuesToIntegrate;

    @Column(name = "integrated_at", scale = 6)
    private LocalDateTime integratedAt;

    @Column(name = "integrated_by", length = 255)
    private String integratedBy;

    @Column(name = "attemp_count", nullable = false, precision = 19)
    @ColumnDefault("0")
    private Long attempCount = 0L ;

    @Column(name = "last_reason", length = 255)
    private String lastReason;

}