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
public class IN_PBSPRMFLG extends Structure {
	public byte slave_no;
	public byte pad;
	public byte di_size;
	public byte do_size;
	public byte di_path;
	public byte do_path;
	public byte di_kind;
	public byte do_kind;
	public byte di_top_address;
	public byte do_top_address;
	public IN_PBSPRMFLG() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("slave_no", "pad", "di_size", "do_size", "di_path", "do_path", "di_kind", "do_kind", "di_top_address", "do_top_address");
	}
	public IN_PBSPRMFLG(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends IN_PBSPRMFLG implements Structure.ByReference {
		
	};
	public static class ByValue extends IN_PBSPRMFLG implements Structure.ByValue {
		
	};
}