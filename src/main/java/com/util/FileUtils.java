package com.util;

import com.hr.datastructures.arrays.twodarrayds.OrderValidator;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class FileUtils {

    public static int[][] convertFileTo2DArray(Path byPath) {
        try {
            return Files.lines(byPath)
                    .map((line) -> line.trim().split("\\s+"))
                    .map((array) ->  Stream.of(array).mapToInt((item) -> {
                            int integerItem = Integer.parseInt(item);
                            OrderValidator.isValid(integerItem);
                            return integerItem;
                    }).toArray()
                    )
                    .toArray(int[][]::new);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static void writeResultToFile(int result) throws IOException{
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();
        bufferedWriter.close();
    }

}
