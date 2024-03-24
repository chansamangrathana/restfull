package co.cstad.restfulsampleapi.dto;

import lombok.Builder;

@Builder
public record ProductResponse(
        int id ,
        String title,
        String description ,
        String imageUrl ,
        float price



) {
}
