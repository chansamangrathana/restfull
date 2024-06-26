package co.cstad.restfulsampleapi.dto;

import lombok.Builder;

@Builder
public record ProductRequest(
        int id,
        String title,
        String description,
        float price,
        String imageUrl
      ) {
}
