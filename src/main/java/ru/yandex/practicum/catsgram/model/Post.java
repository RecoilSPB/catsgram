package ru.yandex.practicum.catsgram.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.Instant;

@Data
@EqualsAndHashCode(of = "id")
public class Post {
    private Long id;
    private String content;
    private User user;
    private String Description;
    private Instant PostDate;

    public Post(Long id, String content, User user) {
        this.id = id;
        this.content = content;
        this.user = user;
    }
}
