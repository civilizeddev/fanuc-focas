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
public class FOCAS2_PRM extends Structure {
	public NativeLong TcpPort;
	public NativeLong UdpPort;
	public NativeLong TimeInterval;
	public FOCAS2_PRM() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("TcpPort", "UdpPort", "TimeInterval");
	}
	public FOCAS2_PRM(NativeLong TcpPort, NativeLong UdpPort, NativeLong TimeInterval) {
		super();
		this.TcpPort = TcpPort;
		this.UdpPort = UdpPort;
		this.TimeInterval = TimeInterval;
	}
	public FOCAS2_PRM(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends FOCAS2_PRM implements Structure.ByReference {
		
	};
	public static class ByValue extends FOCAS2_PRM implements Structure.ByValue {
		
	};
}
