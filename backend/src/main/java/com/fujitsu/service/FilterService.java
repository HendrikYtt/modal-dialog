package com.fujitsu.service;

import com.fujitsu.domain.Filter;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface FilterService {
    List<Filter> getFilters();

    Filter addNewFilter(String name, String amount, String compare, String numericField, String text, String textOptions, String textField, String dateType, String dateOptions, String date, String conditions) throws Exception;


}
