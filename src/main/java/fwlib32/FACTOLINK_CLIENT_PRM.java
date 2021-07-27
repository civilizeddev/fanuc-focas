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
public class FACTOLINK_CLIENT_PRM extends Structure {
	public byte[] HostName = new byte[64];
	public NativeLong Port;
	public FACTOLINK_CLIENT_PRM() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("HostName", "Port");
	}
	public FACTOLINK_CLIENT_PRM(byte HostName[], NativeLong Port) {
		super();
		if ((HostName.length != this.HostName.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.HostName = HostName;
		this.Port = Port;
	}
	public FACTOLINK_CLIENT_PRM(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends FACTOLINK_CLIENT_PRM implements Structure.ByReference {
		
	};
	public static class ByValue extends FACTOLINK_CLIENT_PRM implements Structure.ByValue {
		
	};
}
