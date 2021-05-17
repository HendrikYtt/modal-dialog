package com.fujitsu;

import com.fujitsu.domain.Filter;
import com.fujitsu.repository.FilterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class DemoData {


    private final FilterRepository filterRepository;

    @Autowired
    public DemoData(FilterRepository filterRepository) {
        this.filterRepository = filterRepository;
    }

    @EventListener
    public void appReady(ApplicationReadyEvent event) {

        filterRepository.save(new Filter(1, "Filter 4", "10", "Less than", "5",
                "Title", "Ends with", "nding", "Release date", "Before", "2021-05-13", "All conditions"));
    }
}
