package com.thetestingacademy.RestAssured.Verify;

import org.testng.annotations.Test;

import java.io.File;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.*;

public class Verify003 {
    @Test
    public void asserTJDemo() {
        String response_name = "Pramod";
        assertThat(response_name).isNotNull().isNotBlank().isEqualTo("Pramod");

        List<String> names = Arrays.asList("John", "Jane", "Doe");
        assertThat(names).hasSize(3).contains("Doe").doesNotContain("Dutta");


        Integer bookID = 123;
        assertThat(bookID).isNotNegative().isNotNull().isGreaterThan(0);

        LocalDate date = LocalDate.now();
        System.out.println(date);

        assertThat(date)
                .isAfterOrEqualTo(LocalDate.of(2021, 1, 1))
                .isBeforeOrEqualTo(LocalDate.of(2024, 12, 31))
                .isBetween(
                        LocalDate.of(2023, 1, 1),
                        LocalDate.of(2023, 12, 31)
                );


        File file = new File("Testdata.json");
        assertThat(file).exists().isFile().canRead();


        Map<String, Integer> ages = new HashMap<>();
        ages.put("John", 25);
        ages.put("Jane", 30);

        assertThat(ages)
                .hasSize(2)
                .containsEntry("John", 25)
                .doesNotContainValue(40);


    }
}

