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
public class odbfofs extends Structure {
	public NativeLong mcrval;
	public short decval;
	public odbfofs() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("mcrval", "decval");
	}
	public odbfofs(NativeLong mcrval, short decval) {
		super();
		this.mcrval = mcrval;
		this.decval = decval;
	}
	public odbfofs(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends odbfofs implements Structure.ByReference {
		
	};
	public static class ByValue extends odbfofs implements Structure.ByValue {
		
	};
}
