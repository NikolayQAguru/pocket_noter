package model;

import model.enums.CategoryName;

public class Category {
    private CategoryName name;

    public Category(CategoryName name) {
        this.name = name;
    }


//    public  Category() {}

    public CategoryName getName() {
        return name;
    }
}
