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
public class iodbedge extends Structure {
	public short slct;
	public short angle;
	public short power;
	public short freq;
	public short duty;
	public NativeLong pier_t;
	public short g_press;
	public short g_kind;
	public NativeLong r_len;
	public short r_feed;
	public short r_freq;
	public short r_duty;
	public short gap;
	public short[] reserve = new short[4];
	public iodbedge() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("slct", "angle", "power", "freq", "duty", "pier_t", "g_press", "g_kind", "r_len", "r_feed", "r_freq", "r_duty", "gap", "reserve");
	}
	public iodbedge(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends iodbedge implements Structure.ByReference {
		
	};
	public static class ByValue extends iodbedge implements Structure.ByValue {
		
	};
}
