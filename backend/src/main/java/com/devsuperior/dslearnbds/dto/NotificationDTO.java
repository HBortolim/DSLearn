package com.devsuperior.dslearnbds.dto;

import com.devsuperior.dslearnbds.entities.Notification;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

public class NotificationDTO implements Serializable {
    private Long id;
    private String text;
    private Instant moment;
    private boolean read;
    private String route;
    
    private Long userId;

    public NotificationDTO() {
    }

    public NotificationDTO(Long id, String text, Instant moment, boolean read, String route, Long userId) {
        this.id = id;
        this.text = text;
        this.moment = moment;
        this.read = read;
        this.route = route;
        this.userId = userId;
    }

    public NotificationDTO(Notification entity){
        id = entity.getId();
        text = entity.getText();
        moment = entity.getMoment();
        read = entity.isRead();
        route = entity.getRoute();
        userId = entity.getUser().getId();
    }


    public Long getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public Instant getMoment() {
        return moment;
    }

    public boolean getRead() {
        return read;
    }

    public String getRoute() {
        return route;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NotificationDTO entity = (NotificationDTO) o;
        return Objects.equals(this.id, entity.id) &&
                Objects.equals(this.text, entity.text) &&
                Objects.equals(this.moment, entity.moment) &&
                Objects.equals(this.read, entity.read) &&
                Objects.equals(this.route, entity.route);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, text, moment, read, route);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "text = " + text + ", " +
                "moment = " + moment + ", " +
                "read = " + read + ", " +
                "route = " + route + ")";
    }
}
