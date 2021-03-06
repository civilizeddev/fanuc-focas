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
public class odbsetnum extends Structure {
	public short set_min;
	public short set_max;
	public short total_no;
	public odbsetnum() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("set_min", "set_max", "total_no");
	}
	public odbsetnum(short set_min, short set_max, short total_no) {
		super();
		this.set_min = set_min;
		this.set_max = set_max;
		this.total_no = total_no;
	}
	public odbsetnum(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends odbsetnum implements Structure.ByReference {
		
	};
	public static class ByValue extends odbsetnum implements Structure.ByValue {
		
	};
}
