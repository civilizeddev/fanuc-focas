package fwlib32;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class OUT_FLNTMSG extends Structure {
	public short Count;
	public byte[] reserve = new byte[14];
	public OUT_FLNTEACHMSG[] msgData = new OUT_FLNTEACHMSG[15];
	public OUT_FLNTMSG() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("Count", "reserve", "msgData");
	}
	public OUT_FLNTMSG(short Count, byte reserve[], OUT_FLNTEACHMSG msgData[]) {
		super();
		this.Count = Count;
		if ((reserve.length != this.reserve.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.reserve = reserve;
		if ((msgData.length != this.msgData.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.msgData = msgData;
	}
	public OUT_FLNTMSG(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends OUT_FLNTMSG implements Structure.ByReference {
		
	};
	public static class ByValue extends OUT_FLNTMSG implements Structure.ByValue {
		
	};
}
