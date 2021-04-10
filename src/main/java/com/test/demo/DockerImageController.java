package com.test.demo;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerImageController {
	
	 private static Logger log = LoggerFactory.getLogger(DockerImageController.class);

	private MyService myService;
	
	//public MyService getMyService() {
	//	return myService;
	//}

	public void setMyService(MyService myService) {
		this.myService = myService;
	}





	public DockerImageController(MyService myService)
	{
		this.myService=myService;
	}
	
	
	
	
	
	@GetMapping
	public String message()
	{
		log.info("Message");
		return myService.show();
	}

}
