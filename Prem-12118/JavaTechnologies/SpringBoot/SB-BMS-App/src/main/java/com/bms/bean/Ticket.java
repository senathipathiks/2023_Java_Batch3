package com.bms.bean;

import jakarta.persistence.*;

@Entity
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ticketId;

    private String boardingPoint;
    private String departurePoint;

    @ManyToOne(cascade = CascadeType.REFRESH)
    @JoinColumn(name = "userId")
    private User user;

    // Constructors, getters, and setters
    public Ticket() {}

    public Ticket(String boardingPoint, String departurePoint, User user) {
        this.boardingPoint = boardingPoint;
        this.departurePoint = departurePoint;
        this.user = user;
    }

    public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    public String getBoardingPoint() {
        return boardingPoint;
    }

    public void setBoardingPoint(String boardingPoint) {
        this.boardingPoint = boardingPoint;
    }

    public String getDeparturePoint() {
        return departurePoint;
    }

    public void setDeparturePoint(String departurePoint) {
        this.departurePoint = departurePoint;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
