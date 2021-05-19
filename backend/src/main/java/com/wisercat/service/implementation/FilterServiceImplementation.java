package com.wisercat.service.implementation;

import com.wisercat.domain.Filter;
import com.wisercat.repository.FilterRepository;
import com.wisercat.service.FilterService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
@Transactional
public class FilterServiceImplementation implements FilterService {
    private FilterRepository filterRepository;
    private static Logger logger = LoggerFactory.getLogger(FilterServiceImplementation.class);

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
        filter.setId(1);
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
        validateUndefined(filter);
        filterRepository.save(filter);
        return filter;
    }

    public void validateUndefined(Filter filter) {
        if(filter.getName().equals("undefined")) {
            filter.setName("");
        }
        if(filter.getAmount().equals("undefined")) {
            filter.setAmount("");
        }
        if(filter.getCompare().equals("undefined")) {
            filter.setCompare("");
        }
        if(filter.getNumericField().equals("undefined")) {
            filter.setNumericField("");
        }
        if(filter.getText().equals("undefined")) {
            filter.setText("");
        }
        if(filter.getTextOptions().equals("undefined")) {
            filter.setTextOptions("");
        }
        if(filter.getTextField().equals("undefined")) {
            filter.setTextField("");
        }
        if(filter.getDateType().equals("undefined")) {
            filter.setDateType("");
        }
        if(filter.getDateOptions().equals("undefined")) {
            filter.setDateOptions("");
        }
        if(filter.getDate().equals("undefined")) {
            filter.setDate(null);
        }
        if(filter.getConditions().equals("undefined")) {
            filter.setConditions("");
        }
    }
}
