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
public class odbmmscrninf extends Structure {
	public NativeLong scrn_id;
	public odbmmscrninf() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("scrn_id");
	}
	public odbmmscrninf(NativeLong scrn_id) {
		super();
		this.scrn_id = scrn_id;
	}
	public odbmmscrninf(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends odbmmscrninf implements Structure.ByReference {
		
	};
	public static class ByValue extends odbmmscrninf implements Structure.ByValue {
		
	};
}
