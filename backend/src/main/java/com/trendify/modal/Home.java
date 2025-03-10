package com.trendify.modal;

import lombok.Data;

import java.util.List;

@Data
public class Home {

    private List<HomeCategory> grid;

    private List<HomeCategory> shopByCategory;

    private List<HomeCategory> electricCategory;

    private List<HomeCategory> dealCategories;

    private List<Deal> deals;
}
