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
public class idblppfbfg extends Structure {
	public short s_no;
	public short slct;
	public short s_freq;
	public short e_freq;
	public short s_duty;
	public short e_duty;
	public idblppfbfg() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("s_no", "slct", "s_freq", "e_freq", "s_duty", "e_duty");
	}
	public idblppfbfg(short s_no, short slct, short s_freq, short e_freq, short s_duty, short e_duty) {
		super();
		this.s_no = s_no;
		this.slct = slct;
		this.s_freq = s_freq;
		this.e_freq = e_freq;
		this.s_duty = s_duty;
		this.e_duty = e_duty;
	}
	public idblppfbfg(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends idblppfbfg implements Structure.ByReference {
		
	};
	public static class ByValue extends idblppfbfg implements Structure.ByValue {
		
	};
}