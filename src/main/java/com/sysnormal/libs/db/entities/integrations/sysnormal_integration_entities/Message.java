package com.sysnormal.libs.db.entities.integrations.sysnormal_integration_entities;

import com.sysnormal.libs.db.entities.base_entities.BaseEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Table(name = "MESSAGES")
public class Message extends BaseEntity {

    @Id
    @Column(name = "ID", nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "ATTEMP_COUNT", nullable = false, precision = 19)
    @ColumnDefault("0")
    private Long attempCount =0L;

    @CreationTimestamp
    @Column(name = "CREATED_AT", nullable = false, scale = 6, updatable = false)
    private LocalDateTime createdAt;

    @Column(name = "DELIVERED_AT", scale = 6)
    private LocalDateTime deliveredAt;

    @Column(name = "DESTINY", nullable = false, length = 255)
    private String destiny;

    @Column(name = "DESTINY_TYPE_ID", nullable = false, precision = 10)
    @ColumnDefault("1")
    private Long destinyTypeId = 1L;

    @Column(name = "MESSAGE", nullable = false, length = 4000)
    private String message;

    @Column(name = "SENDED_AT", scale = 6)
    private LocalDateTime sendedAt;

    @Column(name = "CODPROD", precision = 19)
    private Long codprod;

    @Column(name = "NUMPED", precision = 19)
    private Long numped;

    @Column(name = "NUMTRANS", precision = 19)
    private Long numtrans;

    protected static final long TABLE_ID = 35010L;
    public static long getTableId() {
        return TABLE_ID;
    }
}

