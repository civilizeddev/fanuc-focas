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
public class odbhnd extends Structure {
	/** input unit */
	public poselm input;
	/** output unit */
	public poselm output;
	public odbhnd() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("input", "output");
	}
	public odbhnd(poselm input, poselm output) {
		super();
		this.input = input;
		this.output = output;
	}
	public odbhnd(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends odbhnd implements Structure.ByReference {
		
	};
	public static class ByValue extends odbhnd implements Structure.ByValue {
		
	};
}
