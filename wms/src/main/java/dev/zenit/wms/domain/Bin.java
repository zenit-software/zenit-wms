package dev.zenit.wms.domain;

import jakarta.persistence.Entity;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Bin extends Location {

    private BinId binId = BinId.newId();

    private double maxWeightKg;
    private double maxVolumeLiters;
    private boolean conveyable;
    private boolean active = true;
}