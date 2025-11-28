# zenit-wms – Das modernste Open-Source WMS 2025

Wir bauen das Warehouse Management System, das SAP EWM, Manhattan und Körber alt aussehen lässt.

**Vision**: Hexagonal Architecture · Java 21 · Spring Boot 3 · PostgreSQL · Docker · Kubernetes-ready · 100 % testbar

**Architektur**:
- Domain (dieser Commit) → reines Business, kein Spring
- Application → UseCases
- Adapter → REST, JPA, Events
- Infrastructure → alles Spring-Zeug

**Heutiger Stand**: Die vier heiligen Entities + Value Objects sind geboren.

**Nächste Schritte**:
1. JPA Repositories + Id-Strategie
2. Stock anlegen / reservieren / entnehmen
3. Erste TransportOrder
4. REST API v1

zenit-software & Master Yoda – 2025