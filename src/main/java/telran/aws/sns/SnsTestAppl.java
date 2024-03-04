package telran.aws.sns;

import com.amazonaws.client.builder.AwsClientBuilder;
import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.sns.AmazonSNS;
import com.amazonaws.services.sns.AmazonSNSClient;
import com.amazonaws.services.sns.AmazonSNSClientBuilder;
import com.amazonaws.services.sns.model.PublishResult;

public class SnsTestAppl {

	public static void main(String[] args) {
		AmazonSNS snsClient = AmazonSNSClient.builder()
				.withRegion(Regions.US_EAST_1).build();
		PublishResult result = snsClient.publish("arn:aws:sns:us-east-1:992382371280:test-topic",
				"Hello World!!!!!!", "sns-test");
		System.out.println(result.getMessageId());
		
                

        
		

	}

}
