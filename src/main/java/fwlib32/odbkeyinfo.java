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
public class odbkeyinfo extends Structure {
	/** key info */
	public NativeLong[] key = new NativeLong[2];
	public odbkeyinfo() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("key");
	}
	public odbkeyinfo(NativeLong key[]) {
		super();
		if ((key.length != this.key.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.key = key;
	}
	public odbkeyinfo(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends odbkeyinfo implements Structure.ByReference {
		
	};
	public static class ByValue extends odbkeyinfo implements Structure.ByValue {
		
	};
}