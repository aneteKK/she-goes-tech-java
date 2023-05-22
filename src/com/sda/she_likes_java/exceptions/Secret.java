package com.sda.she_likes_java.exceptions;

import java.time.LocalDateTime;
import java.util.Objects;

public class Secret {

    private final LocalDateTime timeStamp;

    private final String ourSecret;

    public Secret(LocalDateTime timeStamp, String ourSecret) {
        this.timeStamp = timeStamp;
        this.ourSecret = ourSecret;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Secret secret)) return false;
        return Objects.equals(getTimeStamp(), secret.getTimeStamp()) && Objects.equals(getOurSecret(), secret.getOurSecret());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTimeStamp(), getOurSecret());
    }

    public LocalDateTime getTimeStamp() {
        return timeStamp;
    }

    public String getOurSecret() {
        return ourSecret;
    }

    @Override
    public String toString() {
        return "Secret{" +
                "timeStamp=" + timeStamp +
                ", ourSecret='" + ourSecret + '\'' +
                '}';
    }
}
