package com.src.EmailSender.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class EmailDTO {
    private String[] to;
    private String subject;
    private String message;
    private String htmlContent;
}
