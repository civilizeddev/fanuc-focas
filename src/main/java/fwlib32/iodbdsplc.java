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
public class iodbdsplc extends Structure {
	public short slct;
	public NativeLong dsplc;
	public short dsplc_dec;
	public byte reserve;
	public short[] reserves = new short[4];
	public iodbdsplc() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("slct", "dsplc", "dsplc_dec", "reserve", "reserves");
	}
	public iodbdsplc(short slct, NativeLong dsplc, short dsplc_dec, byte reserve, short reserves[]) {
		super();
		this.slct = slct;
		this.dsplc = dsplc;
		this.dsplc_dec = dsplc_dec;
		this.reserve = reserve;
		if ((reserves.length != this.reserves.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.reserves = reserves;
	}
	public iodbdsplc(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends iodbdsplc implements Structure.ByReference {
		
	};
	public static class ByValue extends iodbdsplc implements Structure.ByValue {
		
	};
}
