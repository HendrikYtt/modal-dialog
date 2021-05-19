package com.wisercat;

import com.wisercat.domain.Filter;
import com.wisercat.repository.FilterRepository;
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

        filterRepository.save(new Filter(1, "Filter 4", "10", "weniger als", "5",
                "titel", "endet mit", "ung", "Veröffentlichungsdatum", "liegt vor dem", "2021-05-13", "alle Bedingungen"));
    }
}
