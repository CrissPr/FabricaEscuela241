package co.edu.udea.sitas.domain.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "Airport")
public class Airport {
    @Id
    @Column(name = "airport_code")
    private String airportCode;

    @Column(name = "name")
    private String name;

    @Column(name = "type")
    private String type;

    @Column(name = "city")
    private String city;

    @Column(name = "country")
    private String country;

    @Column(name = "runways")
    private int runways;

    @JsonIgnore
    @OneToMany(mappedBy = "origin_airport", cascade = CascadeType.PERSIST, fetch = FetchType.LAZY, orphanRemoval = true)
    private List<Scale> originScales;

    @JsonIgnore
    @OneToMany(mappedBy = "destination_airport", cascade = CascadeType.PERSIST, fetch = FetchType.LAZY, orphanRemoval = true)
    private List<Scale> destinationScales;
}
