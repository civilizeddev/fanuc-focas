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
public class odbsfsgsignalnum extends Structure {
	public short signal_num_default;
	public short signal_num_extract;
	public odbsfsgsignalnum() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("signal_num_default", "signal_num_extract");
	}
	public odbsfsgsignalnum(short signal_num_default, short signal_num_extract) {
		super();
		this.signal_num_default = signal_num_default;
		this.signal_num_extract = signal_num_extract;
	}
	public odbsfsgsignalnum(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends odbsfsgsignalnum implements Structure.ByReference {
		
	};
	public static class ByValue extends odbsfsgsignalnum implements Structure.ByValue {
		
	};
}
