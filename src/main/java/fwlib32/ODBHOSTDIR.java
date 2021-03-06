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
public class ODBHOSTDIR extends Structure {
	public byte[] host_file = new byte[128];
	public ODBHOSTDIR() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("host_file");
	}
	public ODBHOSTDIR(byte host_file[]) {
		super();
		if ((host_file.length != this.host_file.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.host_file = host_file;
	}
	public ODBHOSTDIR(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends ODBHOSTDIR implements Structure.ByReference {
		
	};
	public static class ByValue extends ODBHOSTDIR implements Structure.ByValue {
		
	};
}
