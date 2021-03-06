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
public class iodblpcpr extends Structure {
	public short slct;
	public short power;
	public short freq;
	public short duty;
	public NativeLong time;
	public short[] reserve = new short[4];
	public iodblpcpr() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("slct", "power", "freq", "duty", "time", "reserve");
	}
	public iodblpcpr(short slct, short power, short freq, short duty, NativeLong time, short reserve[]) {
		super();
		this.slct = slct;
		this.power = power;
		this.freq = freq;
		this.duty = duty;
		this.time = time;
		if ((reserve.length != this.reserve.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.reserve = reserve;
	}
	public iodblpcpr(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends iodblpcpr implements Structure.ByReference {
		
	};
	public static class ByValue extends iodblpcpr implements Structure.ByValue {
		
	};
}
