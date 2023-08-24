package com.workintech.library.design;

import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Librarian extends Person {
    private final int password;

    public Librarian(int id, String name, String phoneNumber, int password) {
        super(id, name, phoneNumber);
        this.password = password;
    }

    public int getPassword() {
        return password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Librarian librarian = (Librarian) o;
        return Objects.equals(password, librarian.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), password);
    }

    @Override
    public String toString() {
        return "Librarian{" +
                "password='" + password + '\'' +
                '}';
    }
}
