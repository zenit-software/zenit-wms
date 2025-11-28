package dev.zenit.wms.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Article {

    @Id
    private ArticleId id = ArticleId.newId();

    private String gtin;           // oder interne Nummer
    private String description;
    private String articleGroup;

    private double weightKg;
    private double volumeLiters;
    private boolean conveyable;    // förderfähig?
    private boolean hazardous;     // Gefahrgut?
    private boolean batchManaged;  // Chargenpflichtig?
    private boolean serialManaged; // Seriennummernpflichtig?
}