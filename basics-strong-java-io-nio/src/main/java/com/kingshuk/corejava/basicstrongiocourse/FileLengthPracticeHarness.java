package com.kingshuk.corejava.basicstrongiocourse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class FileLengthPracticeHarness {
    public static final String PARENT_PATH = "/Volumes/WORK/";
    public static final String PRINT_MESSAGE = "The parent directory name is: {}";
    private static final Logger LOGGER = LoggerFactory.getLogger(FileLengthPracticeHarness.class);

    public static void main(String[] args) {
        File directory = new File(PARENT_PATH);
        LOGGER.info(PRINT_MESSAGE, directory.getName());

        Arrays.stream(Objects.requireNonNull(directory.listFiles()))
                .collect(Collectors.toList()).forEach(file -> {
                    LOGGER.info("=========================================================");
                    boolean isFile = file.isFile();
                    String arg1 = isFile ? "file" : "directory";
                    LOGGER.info("Name of the {} is {}", arg1, file.getName());
                    LOGGER.info("Is file or directory? {}", arg1);
                    if (isFile) {
                        LOGGER.info("The length of the file is {}", file.length());
                    }
                });

    }
}
