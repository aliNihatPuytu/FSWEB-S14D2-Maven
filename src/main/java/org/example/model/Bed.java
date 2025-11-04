package org.example.model;

public class Bed {
    private String style;
    private Integer pillows;
    private Integer height;
    private Integer sheets;
    private Integer quilts;

    public Bed(String style, Integer pillows, Integer height, Integer sheets, Integer quilts) {
        this.style = style;
        this.pillows = pillows;
        this.height = height;
        this.sheets = sheets;
        this.quilts = quilts;
    }

    public void make() {
        System.out.println("The bed is being made.");
    }

    public String getStyle() {
        return style;
    }

    public Integer getPillows() {
        return pillows;
    }

    public Integer getHeight() {
        return height;
    }

    public Integer getSheets() {
        return sheets;
    }

    public Integer getQuilts() {
        return quilts;
    }
}
