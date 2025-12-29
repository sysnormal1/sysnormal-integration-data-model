package com.sysnormal.libs.db.entities.integrations.sysnormal_integration_entities;

import com.sysnormal.libs.db.entities.base_entities.BaseEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.Length;
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

    @CreationTimestamp
    @Column(name = "CREATED_AT", nullable = false, scale = 6, updatable = false)
    private LocalDateTime createdAt;

    @Column(name = "SEND_AT", scale = 6)
    private LocalDateTime sendAt;

    @Column(name = "DESTINY_TYPE_ID", nullable = false, precision = 10)
    @ColumnDefault("1")
    private Long destinyTypeId = 1L;

    @Column(name = "DESTINY_ENDPOINT", length = 4000)
    private String destinyEndpoint;

    @Column(name = "DESTINY", nullable = false, length = 255)
    private String destiny;

    @Column(name = "MESSAGE", nullable = false, length = 4000)
    private String message;

    @Column(name = "CODPROD", precision = 19)
    private Long codprod;

    @Column(name = "NUMPED", precision = 19)
    private Long numped;

    @Column(name = "NUMTRANS", precision = 19)
    private Long numtrans;

    @Column(name = "SENDED_AT", scale = 6)
    private LocalDateTime sendedAt;

    @Column(name = "ATTEMP_COUNT", nullable = false, precision = 19)
    @ColumnDefault("0")
    private Long attempCount =0L;

    @Column(name = "DELIVERED_AT", scale = 6)
    private LocalDateTime deliveredAt;

    @Column(name = "RESPONSE_CODE", precision = 4)
    private Integer responseCode;

    @Column(name = "RESPONSE_BODY", length = 4000)
    private String responseBody;

    protected static final long TABLE_ID = 35010L;
    public static long getTableId() {
        return TABLE_ID;
    }
}

