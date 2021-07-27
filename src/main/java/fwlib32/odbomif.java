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
public class odbomif extends Structure {
	/** maximum operator message history */
	public short om_max;
	/** actually operator message history */
	public short om_sum;
	/** maximum character (include NULL) */
	public short om_char;
	public odbomif() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("om_max", "om_sum", "om_char");
	}
	public odbomif(short om_max, short om_sum, short om_char) {
		super();
		this.om_max = om_max;
		this.om_sum = om_sum;
		this.om_char = om_char;
	}
	public odbomif(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends odbomif implements Structure.ByReference {
		
	};
	public static class ByValue extends odbomif implements Structure.ByValue {
		
	};
}