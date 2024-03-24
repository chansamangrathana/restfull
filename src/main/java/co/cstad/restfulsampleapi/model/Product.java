package co.cstad.restfulsampleapi.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Builder
@Data

public class Product {
    private int id;
    private String title;
    private String description;
    private float price;
    private String imageUrl;

}
