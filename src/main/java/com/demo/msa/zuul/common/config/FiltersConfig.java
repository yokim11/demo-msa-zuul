package com.demo.msa.zuul.common.config;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

@Slf4j
@Data
@Component
@ConfigurationProperties(prefix = "zuul.filters")
public class FiltersConfig {

    private List<String> acceptIp;
    private ActiveFilter activeFilter = new ActiveFilter();

    @Data
    public static class ActiveFilter {
        private boolean cmn;
        private boolean service;
        private boolean version;
        private boolean error;
        private boolean maintenance;

    }

    @PostConstruct
    void init() {
        log.debug("FiltersConfig:{}", this);
    }

}

