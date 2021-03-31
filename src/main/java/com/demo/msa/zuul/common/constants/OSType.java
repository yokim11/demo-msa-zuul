package com.demo.msa.zuul.common.constants;

import java.util.Arrays;
import lombok.Getter;

@Getter
public enum OSType {
    IOS("IOS"), ANDROID("ANDROID");

    private final String value;

    OSType(String s) {
        this.value = s;
    }

    public static OSType fromString(String s) {
        return Arrays.stream(OSType.values()).filter(v -> v.value.equalsIgnoreCase(s)).findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Unknown value :" + s));
    }
}
