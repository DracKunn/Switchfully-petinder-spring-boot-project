package com.switchfully.petinder;

public class Pet {
    private final int id;
    private final String name;
    private final Kind kind;
    private final String profileText;

    public Pet(int id, String name, Kind kind, String profileText) {
        this.id = id;
        this.name = name;
        this.kind = kind;
        this.profileText = profileText;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Kind getKind() {
        return kind;
    }

    public String getProfileText() {
        return profileText;
    }
}
