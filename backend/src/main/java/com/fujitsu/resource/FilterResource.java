package com.fujitsu.resource;

import com.fujitsu.domain.Filter;
import com.fujitsu.service.FilterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpStatus.BAD_REQUEST;
import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping(value = "/filter")
@CrossOrigin("http://localhost:4200")
public class FilterResource {

    private FilterService filterService;

    @Autowired
    public FilterResource(FilterService filterService) {
        this.filterService = filterService;
    }

    @PostMapping("/add")
    public ResponseEntity<Filter> addNewFilter(@RequestParam(value="name") String name,
                                               @RequestParam(value="amount") String amount,
                                               @RequestParam(value="compare") String compare,
                                               @RequestParam(value="numericField") String numericField,
                                               @RequestParam(value="text") String text,
                                               @RequestParam(value="textOptions") String textOptions,
                                               @RequestParam(value="textField") String textField,
                                               @RequestParam(value="dateType") String dateType,
                                               @RequestParam(value="dateOptions") String dateOptions,
                                               @RequestParam(value="date") String date,
                                               @RequestParam(value="conditions") String conditions) {
        try {
            Filter newFilter = filterService.addNewFilter(name, amount, compare, numericField, text, textOptions,
                                                            textField, dateType, dateOptions, date, conditions);
            return new ResponseEntity<>(newFilter, OK);
        }
        catch (Exception e) {
            return new ResponseEntity<>(null, BAD_REQUEST);
        }
    }
    @GetMapping("/list")
    public ResponseEntity<List<Filter>> getAllUsers() {
        List<Filter> filters = filterService.getFilters();
        return new ResponseEntity<>(filters, OK);
    }
}
