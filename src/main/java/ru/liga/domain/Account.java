package ru.liga.domain;

public class Account {
    private Long id;
    private Long ownerId;
    private String name;
    private Double volume;

    public Account(Long id, Long ownerId, String name, Double volume){
        this.id = id;
        this.name = name;
        this.ownerId = ownerId;
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", ownerId=" + ownerId +
                ", name='" + name + '\'' +
                ", volume=" + volume +
                '}';
    }

    public Long getId() {
        return id;
    }

    public Long getOwnerId() {
        return ownerId;
    }

    public String getName() {
        return name;
    }

    public Double getVolume() {
        return volume;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }
}
