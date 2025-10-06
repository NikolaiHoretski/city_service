package com.nikolaihoretski.cityService.init;

import com.nikolaihoretski.cityService.dto.PhotoDto;
import com.nikolaihoretski.cityService.service.PhotoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

@Component
public class Initialization implements CommandLineRunner {

    @Autowired
    private PhotoService photoService;

    Logger logger = LoggerFactory.getLogger(Initialization.class);

    @Override
    public void run(String... args) throws Exception {

        if (photoService.hasAnyUsers()) return;

        String path = "D:\\java\\city_service\\cities.csv";

        File file = new File(path);
        if(!file.exists()) {
            throw new FileNotFoundException("\"CSV файл не найден по пути: \" + path");
        }

        List<PhotoDto> photos = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(path), StandardCharsets.UTF_8))) {

            String line;

            reader.readLine();

            while ((line = reader.readLine()) != null) {
                int firstComma = line.indexOf(",");
                int secondComma = line.indexOf(",", firstComma + 1);

                if (firstComma != -1 && secondComma != -1) {
                    long photo_id = Long.parseLong(line.substring(0, firstComma).trim());
                    String name = line.substring(firstComma + 1, secondComma).trim();
                    String photo = line.substring(secondComma + 1).trim();
                    photos.add(new PhotoDto(photo_id, name, photo));
                }
            }
        }
        logger.info("Данные загружены из файла CSV");
        photoService.saveAll(photos);


    }
}
