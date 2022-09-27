package com.kingshuk.corejava.basicstrongiocourse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;

public class FileApiPracticeHarness {


    public static final String PARENT_PATH = "/Volumes/WORK";
    public static final String PRINT_MESSAGE = "The file name is: {}";
    private static final Logger LOGGER = LoggerFactory.getLogger(FileApiPracticeHarness.class);


    public static void main(String[] args) throws URISyntaxException {
        File file1 = new File(PARENT_PATH);
        LOGGER.info(PRINT_MESSAGE, file1.getName());

        File directory = new File(PARENT_PATH);
        LOGGER.info(PRINT_MESSAGE, directory.getName());

        File file2 = new File(directory, "PENDING DEBT PAYMENT.xlsx");
        LOGGER.info(PRINT_MESSAGE, file2.getName());

        File file3 = new File(PARENT_PATH, "PENDING DEBT PAYMENT.xlsx");
        LOGGER.info(PRINT_MESSAGE, file3.getName());

        URI uri = new URI(PARENT_PATH);
        File file4 = new File(uri);
        LOGGER.info(PRINT_MESSAGE, file4.getName());
    }

}
