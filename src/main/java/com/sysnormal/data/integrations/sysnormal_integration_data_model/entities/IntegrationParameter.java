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
@Table(name = "integration_parameters")
@Getter
@Setter
public class IntegrationParameter extends BaseEntity {

    @Id
    @Column(name = "id", nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @CreationTimestamp
    @Column(name = "created_at", nullable = false, scale = 6)
    private LocalDateTime createdAt;

    @Column(name = "parameter_type", nullable = false, length = 100)
    @ColumnDefault("TEXT")
    private String parameterType = "TEXT";

    @Column(name = "parameter_name", nullable = false, length = 4000, unique = true)
    private String parameterName;

    @Column(name = "parameter_value", length = 4000)
    private String parameterValue;


}