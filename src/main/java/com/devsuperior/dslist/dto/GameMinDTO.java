package com.devsuperior.dslist.dto;

import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.projections.GameMinProjection;

public class GameMinDTO {

    private Long id;
    private String title;
    private Integer year;
    private String imgUrl;
    private String shortDescription;

    public GameMinDTO(){
    }

    public GameMinDTO(Game entity) {
        id = entity.getId();
        imgUrl = entity.getImgUrl();
        shortDescription = entity.getShortDescription();
        title = entity.getTitle();
        year = entity.getYear();
    }

    public GameMinDTO(GameMinProjection projection) {
        id = projection.getId();
        imgUrl = projection.getImgUrl();
        shortDescription = projection.getShortDescription();
        title = projection.getTitle();
        year = projection.getYear();
    }

    public Long getId() {
        return id;
    }

    public Integer getYear() {
        return year;
    }

    public String getTitle() {
        return title;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public String getImgUrl() {
        return imgUrl;
    }
}
