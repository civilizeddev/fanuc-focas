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
public class odblopdt extends Structure {
	public short slct;
	public short pwr_mon;
	public short pwr_ofs;
	public short pwr_act;
	public NativeLong feed_act;
	public byte feed_dec;
	public byte reserve;
	public short[] reserves = new short[3];
	public odblopdt() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("slct", "pwr_mon", "pwr_ofs", "pwr_act", "feed_act", "feed_dec", "reserve", "reserves");
	}
	public odblopdt(short slct, short pwr_mon, short pwr_ofs, short pwr_act, NativeLong feed_act, byte feed_dec, byte reserve, short reserves[]) {
		super();
		this.slct = slct;
		this.pwr_mon = pwr_mon;
		this.pwr_ofs = pwr_ofs;
		this.pwr_act = pwr_act;
		this.feed_act = feed_act;
		this.feed_dec = feed_dec;
		this.reserve = reserve;
		if ((reserves.length != this.reserves.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.reserves = reserves;
	}
	public odblopdt(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends odblopdt implements Structure.ByReference {
		
	};
	public static class ByValue extends odblopdt implements Structure.ByValue {
		
	};
}
