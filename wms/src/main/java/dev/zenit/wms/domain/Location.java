package dev.zenit.wms.domain;

import jakarta.persistence.*;
import lombok.*;

@MappedSuperclass
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public abstract class Location {

    @Id
    private String code;           // z. B. A-01-02-03

    private String warehouse;      // WERK1, WERK2...
    private String zone;           // Hochregal, Fördertechnik, Kommissionierung...
    private String aisle;          // Gang
    private int rack;              // Regal
    private int level;             // Ebene
    private int position;          // Platz
}