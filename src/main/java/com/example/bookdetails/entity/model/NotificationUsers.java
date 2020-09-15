package com.example.bookdetails.entity.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class NotificationUsers {
    private long id;
    private long saleId;
    private String lastSeen;
    private String lastNotifyFetch;
}
