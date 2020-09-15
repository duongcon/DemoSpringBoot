package com.example.bookdetails.entity.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Media {
    private long id;
    private int kind;
    private String fileName;
    private String fileSource;
    private String fileType;
    private String fileExtension;
    private String uuid;
    private int objectId;
    private String objectType;
    private int creatorableId;
    private String creatorableType;
    private String kindName;
}
