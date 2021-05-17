package com.fujitsu.service.implementation;

import com.fujitsu.domain.Filter;
import com.fujitsu.repository.FilterRepository;
import com.fujitsu.service.FilterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class FilterServiceImplementation implements FilterService {
    private FilterRepository filterRepository;

    @Autowired
    public FilterServiceImplementation(FilterRepository filterRepository) {
        this.filterRepository = filterRepository;
    }

    @Override
    public List<Filter> getFilters() {
        return filterRepository.findAll();
    }

    @Override
    public Filter addNewFilter(String name, String amount, String compare, String numericField, String text, String textOptions, String textField, String dateType, String dateOptions, String date, String conditions) throws Exception {
        Filter filter = new Filter();
        filter.setName(name);
        filter.setAmount(amount);
        filter.setCompare(compare);
        filter.setNumericField(numericField);
        filter.setText(text);
        filter.setTextOptions(textOptions);
        filter.setTextField(textField);
        filter.setDateType(dateType);
        filter.setDateOptions(dateOptions);
        filter.setDate(date);
        filter.setConditions(conditions);
        filterRepository.save(filter);
        return filter;
    }


}
