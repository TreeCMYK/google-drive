package googledrive.domain;

import com.fasterxml.jackson.databind.ObjectMapper;
import googledrive.VideoProcessingApplication;
import googledrive.domain.VideoProcessed;
import java.time.LocalDate;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Video_table")
@Data
//<<< DDD / Aggregate Root
public class Video {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String videoUrl;

    private String fileKey;

    @PostPersist
    public void onPostPersist() {
        VideoProcessed videoProcessed = new VideoProcessed(this);
        videoProcessed.publishAfterCommit();
    }

    public static VideoRepository repository() {
        VideoRepository videoRepository = VideoProcessingApplication.applicationContext.getBean(
            VideoRepository.class
        );
        return videoRepository;
    }

    //<<< Clean Arch / Port Method
    public static void processVideo(FileUploaded fileUploaded) {
        //implement business logic here:

        /** Example 1:  new item 
        Video video = new Video();
        repository().save(video);

        */

        /** Example 2:  finding and process
        

        repository().findById(fileUploaded.get???()).ifPresent(video->{
            
            video // do something
            repository().save(video);


         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
