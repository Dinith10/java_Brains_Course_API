package mainPackage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import topic.Topic;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {




    @Autowired
    private TopicService topicService;


    @RequestMapping(value = "/topics")
    public List<Topic> getAllTopics(){



        return topicService.getAllTopics();



    }



    @RequestMapping( value = "/topics/{ides}" )
    public Topic getTopic( @PathVariable(value = "ides") String id ){


        return topicService.getTopic(id);

    }

    @RequestMapping(method = RequestMethod.POST, value = "/topics")
    public void addTopic( @RequestBody Topic topic){

        topicService.addTopic(topic);




    }




}
