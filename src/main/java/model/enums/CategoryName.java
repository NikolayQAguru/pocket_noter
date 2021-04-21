package model.enums;

public enum CategoryName {
    H("Home"),
    W("Work"),
    S("Study"),
    HB("Hobby");

    private String name;

    CategoryName(String name) {this.name = name; }

    @Override
    public String toString() {
        return name;
    }
}
