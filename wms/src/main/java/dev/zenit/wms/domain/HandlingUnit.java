package dev.zenit.wms.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class HandlingUnit {

    @Id
    private HandlingUnitId id = HandlingUnitId.newId();

    private String lpn;                    // License Plate Number
    private String type;                   // PAL, TRAY, CARTON...
    private double currentWeightKg;
    private double currentVolumeLiters;

    @ManyToOne
    private Bin currentBin;                // aktueller Lagerplatz
}