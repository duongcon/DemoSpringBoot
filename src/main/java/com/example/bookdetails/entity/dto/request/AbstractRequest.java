package com.example.bookdetails.entity.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class AbstractRequest implements Serializable {
    protected long currentTime;
}
