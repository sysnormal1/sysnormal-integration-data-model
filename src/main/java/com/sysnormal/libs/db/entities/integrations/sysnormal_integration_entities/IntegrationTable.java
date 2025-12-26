package com.sysnormal.libs.db.entities.integrations.sysnormal_integration_entities;

import com.sysnormal.libs.db.entities.base_entities.BaseEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "integration_tables")
@Getter
@Setter
public class IntegrationTable extends BaseEntity {

    @Id
    @Column(name = "id", nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @CreationTimestamp
    @Column(name = "created_at", nullable = false, scale = 6)
    private LocalDateTime createdAt;

    @Column(name = "schema_name", nullable = false, length = 510)
    private String schemaName;

    @Column(name = "user_name", length = 510)
    private String userName;

    @Column(name = "table_name", nullable = false, length = 510)
    private String tableName;

    @Column(name = "identifier_column", nullable = false, length = 510)
    private String identifierColumn;

    @Column(name = "integrate", nullable = false, precision = 1)
    @ColumnDefault("1")
    private Integer integrate = 1 ;

    @Column(name = "integrate_insert", nullable = false, precision = 1)
    @ColumnDefault("1")
    private Integer integrateInsert = 1 ;

    @Column(name = "integrate_update", nullable = false, precision = 1)
    @ColumnDefault("1")
    private Integer integrateUpdate = 1 ;

    @Column(name = "integrate_delete", nullable = false, precision = 1)
    @ColumnDefault("1")
    private Integer integrateDelete = 1 ;

    @Column(name = "integrate_on_demand", nullable = false, precision = 1)
    @ColumnDefault("1")
    private Integer integrateOnDemand = 1 ;

    @Column(name = "integrate_by_time", length = 4000)
    private String integrateByTime;
}