package co.cstad.restfulsampleapi.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Builder

@Data
public class Category {
    private int id;
    private String title;
    private String description;
}
