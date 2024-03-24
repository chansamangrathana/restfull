package co.cstad.restfulsampleapi.dto;

import lombok.Builder;

@Builder
public record CategoryRequest(int id,String title,String description) {

}
