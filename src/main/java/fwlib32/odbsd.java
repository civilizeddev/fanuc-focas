package fwlib32;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import com.sun.jna.ptr.NativeLongByReference;
import com.sun.jna.ptr.ShortByReference;
import java.util.Arrays;
import java.util.List;
/**
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class odbsd extends Structure {
	public ShortByReference chadata;
	public NativeLongByReference count;
	public odbsd() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("chadata", "count");
	}
	public odbsd(ShortByReference chadata, NativeLongByReference count) {
		super();
		this.chadata = chadata;
		this.count = count;
	}
	public odbsd(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends odbsd implements Structure.ByReference {
		
	};
	public static class ByValue extends odbsd implements Structure.ByValue {
		
	};
}
