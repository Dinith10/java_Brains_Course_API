package mainPackage;

import org.springframework.stereotype.Service;
import topic.Topic;

import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

   List<Topic> topics =  Arrays.asList(

               new Topic("spring2", "Spring Framework", "Spring Framework Description"),
               new Topic("java", "Core Java", "Core Java Description"),
               new Topic("javascript", "JavaScript", "JavaScript Description")

        );



   public List<Topic> getAllTopics(){


       return  topics;


   }

   public Topic getTopic( String id ){


      return   topics.stream().filter( t -> t.getId().equals(id)).findFirst().get();




    public void addTopic(Topic topic) {



       topics.add(topic);









    }
}
