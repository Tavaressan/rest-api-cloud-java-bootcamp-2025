package me.dio.domain.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "tb_news")
public non-sealed class News extends BaseItem  {

}