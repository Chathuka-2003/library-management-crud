package org.example.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//Setup database 
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BookDTO {

    private long isbn;
    private String title;
    private String author;
}
