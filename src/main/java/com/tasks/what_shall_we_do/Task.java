package com.tasks.what_shall_we_do;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Task {
    String id;
    String title;
    String description;
}
