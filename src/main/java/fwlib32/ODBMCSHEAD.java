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
public class ODBMCSHEAD extends Structure {
	public byte layout;
	public byte[] string1 = new byte[51];
	public byte[] string2 = new byte[51];
	public ODBMCSHEAD() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("layout", "string1", "string2");
	}
	public ODBMCSHEAD(byte layout, byte string1[], byte string2[]) {
		super();
		this.layout = layout;
		if ((string1.length != this.string1.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.string1 = string1;
		if ((string2.length != this.string2.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.string2 = string2;
	}
	public ODBMCSHEAD(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends ODBMCSHEAD implements Structure.ByReference {
		
	};
	public static class ByValue extends ODBMCSHEAD implements Structure.ByValue {
		
	};
}