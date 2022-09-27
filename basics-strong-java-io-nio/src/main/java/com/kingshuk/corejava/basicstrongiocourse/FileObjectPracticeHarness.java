package com.kingshuk.corejava.basicstrongiocourse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;

public class FileObjectPracticeHarness {
    public static final String PARENT_PATH = "/Volumes/WORK/";
    public static final String PRINT_MESSAGE = "The file name is: {}";
    private static final Logger LOGGER = LoggerFactory.getLogger(FileObjectPracticeHarness.class);

    public static void main(String[] args) throws IOException {
        File file1 = new File(PARENT_PATH+"kingshuk-test.txt");
        LOGGER.info(PRINT_MESSAGE, file1.getName());

        LOGGER.info("Does file exist? {}", file1.exists());

        LOGGER.info("Was the file created? {}", file1.createNewFile());

        LOGGER.info("Does file exist now? {}", file1.exists());

        File dir = new File(PARENT_PATH+"JAVA-IO-NIO-COURSE");


        LOGGER.info("Does file exist? {}", dir.exists());

        LOGGER.info("Was the directory created? {}", dir.mkdir());

        LOGGER.info("Does file exist now? {}", dir.exists());
    }
}
