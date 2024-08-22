package ru.yandex.practicum.catsgram.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(of = "id")
public class Image {
    private Long id;
    private String url;
    private Post post;

    public Image(Long id, String url, Post post) {
        this.id = id;
        this.url = url;
        this.post = post;
    }
}
