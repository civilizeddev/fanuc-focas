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
public class iodbedge2 extends Structure {
	public short slct;
	public short power;
	public short freq;
	public short duty;
	public short g_press;
	public short g_kind;
	public NativeLong pier_t;
	public NativeLong angle;
	public NativeLong gap;
	public NativeLong r_len;
	public NativeLong r_feed;
	public short r_freq;
	public short r_duty;
	public byte gap_axis;
	public byte angle_dec;
	public byte gap_dec;
	public byte r_len_dec;
	public byte r_feed_dec;
	public byte reserve;
	public short[] reserves = new short[3];
	public iodbedge2() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("slct", "power", "freq", "duty", "g_press", "g_kind", "pier_t", "angle", "gap", "r_len", "r_feed", "r_freq", "r_duty", "gap_axis", "angle_dec", "gap_dec", "r_len_dec", "r_feed_dec", "reserve", "reserves");
	}
	public iodbedge2(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends iodbedge2 implements Structure.ByReference {
		
	};
	public static class ByValue extends iodbedge2 implements Structure.ByValue {
		
	};
}
