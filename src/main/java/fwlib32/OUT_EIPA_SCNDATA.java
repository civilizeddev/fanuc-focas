package fwlib32;
import com.sun.jna.NativeLong;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class OUT_EIPA_SCNDATA extends Structure {
	public NativeLong ConnectionId;
	public NativeLong ConnectTime;
	public byte[] IpAddress = new byte[40];
	public OUT_EIPA_SCNDATA() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("ConnectionId", "ConnectTime", "IpAddress");
	}
	public OUT_EIPA_SCNDATA(NativeLong ConnectionId, NativeLong ConnectTime, byte IpAddress[]) {
		super();
		this.ConnectionId = ConnectionId;
		this.ConnectTime = ConnectTime;
		if ((IpAddress.length != this.IpAddress.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.IpAddress = IpAddress;
	}
	public OUT_EIPA_SCNDATA(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends OUT_EIPA_SCNDATA implements Structure.ByReference {
		
	};
	public static class ByValue extends OUT_EIPA_SCNDATA implements Structure.ByValue {
		
	};
}
