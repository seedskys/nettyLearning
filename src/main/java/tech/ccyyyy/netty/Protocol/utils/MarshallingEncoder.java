package tech.ccyyyy.netty.Protocol.utils;

import java.io.IOException;
import org.jboss.marshalling.Marshaller;

/**
 * @author zcy
 * @date 2019年3月27日 下午9:28:27
*/

public class MarshallingEncoder {
	private static final byte[] LENGTH_PLACEHOLDER=new byte[4];
	Marshaller marshaller;
	
	
	public MarshallingEncoder() throws IOException {
		marshaller=MarshallingCodecFactory.buildMarshalling();
	}


}
