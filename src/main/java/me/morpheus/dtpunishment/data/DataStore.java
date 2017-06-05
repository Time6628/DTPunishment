package me.morpheus.dtpunishment.data;

import java.time.Instant;
import java.time.LocalDate;
import java.util.UUID;

public interface DataStore {

    void init();

    int getBanpoints(UUID player);

    LocalDate getBanpointsUpdatedAt(UUID player);

    int getMutepoints(UUID player);

    LocalDate getMutepointsUpdatedAt(UUID player);

    boolean isMuted(UUID player);

    Instant getExpiration(UUID player);

    void addBanpoints(UUID player, int amount);

    void removeBanpoints(UUID player, int amount);

    void addMutepoints(UUID player, int amount);

    void removeMutepoints(UUID player, int amount);

    void mute(UUID player, Instant expiration);

    void unmute(UUID player);

    void createUser(UUID player);

    boolean userExists(UUID player);
}
