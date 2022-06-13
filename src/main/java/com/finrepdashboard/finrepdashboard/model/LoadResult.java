package com.finrepdashboard.finrepdashboard.model;
import lombok.*;

@Getter @Setter @RequiredArgsConstructor
public class LoadResult {
    public static final String STAT_SUCCESS="success";
    public static final String STAT_FAILURE="failed";
    public static final String STAT_WARNING="warning";

    @NonNull
    private Integer identifier;

    @NonNull
    private String status;

    @NonNull
    private String message;

    private String outcome;

    private Exception exception;
}
