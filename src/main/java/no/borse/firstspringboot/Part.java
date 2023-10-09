package no.borse.firstspringboot;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

// Another way to do it is JsonIgnoreProperties. If jackson tries to map everything across, if there's no correlation, just ignore it.
@JsonIgnoreProperties
public record Part (
        // A way to declare another name. This field can also be called as = X
        // @JsonProperty("nomenclature")
        String name
){

}
