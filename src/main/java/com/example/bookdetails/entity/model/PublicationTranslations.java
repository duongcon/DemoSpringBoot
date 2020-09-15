package com.example.bookdetails.entity.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class PublicationTranslations {
    private long id;
    private long publicationId;
    private String locale;
    private LocalDateTime createdAtTime;
    private LocalDateTime updatedAtTime;
    private String title;
    private String shortDescription;
    private String fullDescription;
    private int thumbnailImage;
}
