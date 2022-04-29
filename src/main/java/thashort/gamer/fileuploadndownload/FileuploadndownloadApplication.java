package thashort.gamer.fileuploadndownload;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import thashort.gamer.fileuploadndownload.property.FileStorageProperties;

@EnableSwagger2
@SpringBootApplication
@EnableConfigurationProperties({
        FileStorageProperties.class
})
public class FileuploadndownloadApplication {

    public static void main(String[] args) {
        SpringApplication.run(FileuploadndownloadApplication.class, args);
    }

}
