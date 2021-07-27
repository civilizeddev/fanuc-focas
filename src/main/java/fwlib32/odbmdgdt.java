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
public class odbmdgdt extends Structure {
	public odbmdgval dt;
	public short fp;
	public short reserved;
	public odbmdgdt() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("dt", "fp", "reserved");
	}
	public odbmdgdt(odbmdgval dt, short fp, short reserved) {
		super();
		this.dt = dt;
		this.fp = fp;
		this.reserved = reserved;
	}
	public odbmdgdt(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends odbmdgdt implements Structure.ByReference {
		
	};
	public static class ByValue extends odbmdgdt implements Structure.ByValue {
		
	};
}
