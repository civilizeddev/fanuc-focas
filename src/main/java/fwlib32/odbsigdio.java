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
public class odbsigdio extends Structure {
	public byte sgnl1;
	public byte sgnl2;
	public byte sgnl3;
	public byte sgnl4;
	public odbsigdio() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("sgnl1", "sgnl2", "sgnl3", "sgnl4");
	}
	public odbsigdio(byte sgnl1, byte sgnl2, byte sgnl3, byte sgnl4) {
		super();
		this.sgnl1 = sgnl1;
		this.sgnl2 = sgnl2;
		this.sgnl3 = sgnl3;
		this.sgnl4 = sgnl4;
	}
	public odbsigdio(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends odbsigdio implements Structure.ByReference {
		
	};
	public static class ByValue extends odbsigdio implements Structure.ByValue {
		
	};
}
