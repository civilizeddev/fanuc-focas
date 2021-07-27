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
public class wseterror extends Structure {
	public NativeLong data;
	public short dec;
	public short dummy;
	public wseterror() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("data", "dec", "dummy");
	}
	public wseterror(NativeLong data, short dec, short dummy) {
		super();
		this.data = data;
		this.dec = dec;
		this.dummy = dummy;
	}
	public wseterror(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends wseterror implements Structure.ByReference {
		
	};
	public static class ByValue extends wseterror implements Structure.ByValue {
		
	};
}
