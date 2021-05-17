package com.fujitsu.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Filter implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id; // Id is auto-generated
    private String name, amount, compare, numericField, text, textOptions,
                   textField, dateType, dateOptions, date, conditions;

    public Filter() {
    }

    public Filter(int id, String name, String amount, String compare, String numericField, String text, String textOptions, String textField, String dateType, String dateOptions, String date, String conditions) {
        this.id = id;
        this.name = name;
        this.amount = amount;
        this.compare = compare;
        this.numericField = numericField;
        this.text = text;
        this.textOptions = textOptions;
        this.textField = textField;
        this.dateType = dateType;
        this.dateOptions = dateOptions;
        this.date = date;
        this.conditions = conditions;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getCompare() {
        return compare;
    }

    public void setCompare(String compare) {
        this.compare = compare;
    }

    public String getNumericField() {
        return numericField;
    }

    public void setNumericField(String numericField) {
        this.numericField = numericField;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTextOptions() {
        return textOptions;
    }

    public void setTextOptions(String textOptions) {
        this.textOptions = textOptions;
    }

    public String getTextField() {
        return textField;
    }

    public void setTextField(String textField) {
        this.textField = textField;
    }

    public String getDateType() {
        return dateType;
    }

    public void setDateType(String dateType) {
        this.dateType = dateType;
    }

    public String getDateOptions() {
        return dateOptions;
    }

    public void setDateOptions(String dateOptions) {
        this.dateOptions = dateOptions;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getConditions() {
        return conditions;
    }

    public void setConditions(String conditions) {
        this.conditions = conditions;
    }
}
